package com.user_interface.service;

import com.user_interface.client.VehicleApiClient;
import com.user_interface.dto.vehicle.VehicleDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.List;

@Service
@AllArgsConstructor
public class UserInterfaceServiceImpl implements UserInterfaceService {

    private VehicleApiClient vehicleApiClient;

    @Override
    public List<VehicleDto> findAllVehicles() {
        return vehicleApiClient.findAllVehicles();
    }

    @Override
    public VehicleDto findVehicleByVIN(String vin) {
        return vehicleApiClient.findVehicleByVIN(vin);
    }

    @Override
    public VehicleDto findVehicleByRegistrationNumber(String number) {
        return vehicleApiClient.findVehicleByRegistrationNumber(number);
    }

    @Override
    public VehicleDto createVehicle(VehicleDto vehicleDto) {
        return vehicleApiClient.createVehicle(vehicleDto);
    }

    @Override
    public VehicleDto updateVehicle(VehicleDto vehicleDto, String number) {
        return vehicleApiClient.updateVehicle(vehicleDto, number);
    }

//    @Override
//    public String updateVehicle(String registration,
//    VehicleDto vehicleDto, BindingResult result, Model model) {
//        return vehicleApiClient.;
//    }

    @Override
    public Void deleteVehicleByRegistrationNumber(String number) {
        return vehicleApiClient.deleteVehicleByRegistrationNumber(number);
    }

}
