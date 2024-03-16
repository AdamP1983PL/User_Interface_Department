package com.user_interface.client;

import com.user_interface.dto.vehicle.VehicleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "${vehicle-department.application.name}")
public interface VehicleApiClient {

    @GetMapping("/api/vehicle/")
    List<VehicleDto> findAllVehicles();

    @GetMapping("/api/vehicle/vin/{vin}")
    VehicleDto findVehicleByVIN(@PathVariable("vin") String vin);

    @GetMapping("/api/vehicle/reg-num/{number}")
    VehicleDto findVehicleByRegistrationNumber(@PathVariable("number") String number);

    @PostMapping("/api/vehicle/")
    VehicleDto createVehicle(@RequestBody VehicleDto vehicleDto);

    @PutMapping("/api/vehicle/{number}")
    VehicleDto updateVehicle(@RequestBody VehicleDto vehicleDto,
                             @PathVariable("number") String number);

//    @PostMapping("/api/vehicle/frontend/update/{registration}")
//    String updateVehicle(@PathVariable("registration") String registration,
//                                @Valid @ModelAttribute("vehicleDto") VehicleDto vehicleDto,
//                                 Model model);

    @DeleteMapping("/api/vehicle/{number}")
    Void deleteVehicleByRegistrationNumber(@PathVariable("number") String number);

}
