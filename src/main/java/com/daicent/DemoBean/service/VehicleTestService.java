package com.daicent.DemoBean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleTestService {

    @Autowired
//        @Qualifier("planeVehicleServiceConfiguration")
    private VehicleService vehicleService;

    public void testVehicle() {
        vehicleService.startEngine();
        vehicleService.move();
        vehicleService.stopEngine();
    }
}
