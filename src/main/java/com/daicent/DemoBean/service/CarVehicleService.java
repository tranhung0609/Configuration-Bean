package com.daicent.DemoBean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarVehicleService implements VehicleService {

    private Logger logger =  LoggerFactory.getLogger(CarVehicleService.class);

    @Override
    public void startEngine() {
        System.out.println("CarVehicleService.startEngine");
    }

    @Override
    public void move() {
        System.out.println("CarVehicleService.move");
    }

    @Override
    public void stopEngine() {
        System.out.println("CarVehicleService.stopEngine");
    }
}
