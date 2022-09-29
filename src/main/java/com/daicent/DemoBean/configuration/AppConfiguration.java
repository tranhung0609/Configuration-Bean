package com.daicent.DemoBean.configuration;

import com.daicent.DemoBean.service.CarVehicleService;
import com.daicent.DemoBean.service.PlaneVehicleService;
import com.daicent.DemoBean.service.VehicleService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfiguration {
    @Bean
//    @Qualifier("carVehicleServiceConfiguration")
    @ConditionalOnProperty(value="vehicle.service.mode", havingValue = "car", matchIfMissing = false)
    public VehicleService carVehicleServiceConfiguration(){
        return new CarVehicleService();
    }

    @Bean
//    @Primary
//    @Qualifier("planeVehicleServiceConfiguration")
    @ConditionalOnProperty(value="vehicle.service.mode", havingValue = "plane", matchIfMissing = true)
    public VehicleService planeVehicleServiceConfiguration(){
        return new PlaneVehicleService();
    }
}
