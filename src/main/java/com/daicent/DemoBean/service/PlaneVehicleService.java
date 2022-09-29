package com.daicent.DemoBean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlaneVehicleService implements VehicleService {

    private Logger logger =  LoggerFactory.getLogger(PlaneVehicleService.class);

    @Override
    public void startEngine() {
        System.out.println("PlaneVehicleService.startEngine");
    }

    @Override
    public void move() {
        System.out.println("PlaneVehicleService.move");
    }

    @Override
    public void stopEngine() {
        System.out.println("PlaneVehicleService.stopEngine");
    }
}
