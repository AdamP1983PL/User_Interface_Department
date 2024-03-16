package com.user_interface.service.vehicle_service;

import com.user_interface.dto.vehicle.VehicleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "${spring.application.name}")
public interface UserInterfaceService {

    List<VehicleDto> findAllVehicles();
    VehicleDto findVehicleByVIN(@PathVariable("vin") String vin);
    VehicleDto findVehicleByRegistrationNumber(@PathVariable("number") String number);
    VehicleDto createVehicle(@RequestBody VehicleDto vehicleDto);
    VehicleDto updateVehicle(@RequestBody VehicleDto vehicleDto,
                             @PathVariable("number") String number);
//    String updateVehicle(@PathVariable("registration") String registration,
//                         @Valid @ModelAttribute("vehicleDto") VehicleDto vehicleDto,
//                         BindingResult result, Model model);
    Void deleteVehicleByRegistrationNumber(@PathVariable("number") String number);

}
