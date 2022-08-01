package com.thymeleaf.app.domain.services;

import com.thymeleaf.app.domain.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle save (Vehicle vehicle);
    List<Vehicle> listVehicle();
    Vehicle getVehicleById(Long idVehiculo);
}
