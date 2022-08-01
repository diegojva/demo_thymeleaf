package com.thymeleaf.app.domain.services.impl;

import com.thymeleaf.app.domain.Vehicle;
import com.thymeleaf.app.domain.services.VehicleService;
import com.thymeleaf.app.infrastracture.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }

    @Override
    public List<Vehicle> listVehicle() {
        return vehicleRepo.findAll();
    }

    @Override
    public Vehicle getVehicleById(Long idVehiculo) {
        return vehicleRepo.findById(idVehiculo).orElse(null);
    }
}
