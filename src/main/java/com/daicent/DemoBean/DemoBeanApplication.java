package com.daicent.DemoBean;

import com.daicent.DemoBean.service.VehicleService;
import com.daicent.DemoBean.service.VehicleTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoBeanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoBeanApplication.class, args);
		VehicleService vehicleService = context.getBean(VehicleService.class);
//		vehicleService.startEngine();
//		vehicleService.move();
//		vehicleService.stopEngine();
		VehicleTestService vehicleTestService = context.getBean(VehicleTestService.class);
		vehicleTestService.testVehicle();
	}

}
