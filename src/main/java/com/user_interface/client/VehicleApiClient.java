package com.user_interface.client;

import com.user_interface.dto.vehicle.VehicleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "${vehicle-department.application.name}")
public interface VehicleApiClient {

    @GetMapping("/")
    List<VehicleDto> findAllVehicles();

    @GetMapping("/vin/{vin}")
    VehicleDto findVehicleByVIN(@PathVariable("vin") String vin);

    @GetMapping("/reg-num/{number}")
    VehicleDto findVehicleByRegistrationNumber(@PathVariable("number") String number);

    @PostMapping("/")
    VehicleDto createVehicle(@RequestBody VehicleDto vehicleDto);

    @PutMapping("/{number}")
    VehicleDto updateVehicle(@RequestBody VehicleDto vehicleDto,
                             @PathVariable("number") String number);

    @DeleteMapping("/{number}")
    Void deleteVehicleByRegistrationNumber(@PathVariable("number") String number);

}
