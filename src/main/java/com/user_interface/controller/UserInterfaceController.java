package com.user_interface.controller;

import com.user_interface.dto.vehicle.VehicleDto;
import com.user_interface.service.UserInterfaceServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@AllArgsConstructor
public class UserInterfaceController {

    private UserInterfaceServiceImpl userInterfaceService;

    @GetMapping("/login")
    public String showIndex() {
        return "login";
    }

    @GetMapping("/home")
    public String showHome() {
        return "home";
    }

    @GetMapping("/home/find-all-vehicles")
    public String showAllVehicles(Model model) {
        List<VehicleDto> vehicleDtoList = userInterfaceService.findAllVehicles();
        model.addAttribute("vehicleDtoList", vehicleDtoList);
        return "all-vehicles";
    }

    @GetMapping("/home/find-vehicle-by-vin/{vin}")
    public String findVehicleByVin(@PathVariable("vin") String vin, Model model) {
        VehicleDto vehicleDto = userInterfaceService.findVehicleByVIN(vin);
        model.addAttribute("vehicleDto", vehicleDto);
        return "vehicle-by-vin";
    }

    @GetMapping("/home/add-vehicle")
    public String showAddVehiclePage(Model model) {
        VehicleDto vehicleDto = new VehicleDto();
        model.addAttribute("vehicleDto", vehicleDto);
        log.info("====>>>> addVehicle() execution");
        return "add-new-vehicle";
    }

    @PostMapping("/home/create-vehicle")
    public String saveNewVehicle(@Valid @ModelAttribute("vehicleDto") VehicleDto vehicleDto,
                                 BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("vehicleDto", vehicleDto);
            return "add-new-vehicle";
        }

        userInterfaceService.createVehicle(vehicleDto);
        log.info("====>>>> saveNewVehicle() execution");
        return "redirect:/home/find-all-vehicles";
    }

    @GetMapping("/home/details/{registration}")
    public String showVehicleDetails(@PathVariable("registration") String registration, Model model) {
        VehicleDto vehicleDetails = userInterfaceService.findVehicleByRegistrationNumber(registration);
        model.addAttribute("vehicleDetails", vehicleDetails);
        log.info("====>>>> showVehicleDetails() execution");
        return "vehicle-details-api";
    }

    @GetMapping("/home/edit/{registration}")
    public String editVehicle(@PathVariable("registration") String registration, Model model) {
        VehicleDto vehicleDto = userInterfaceService.findVehicleByRegistrationNumber(registration);
        model.addAttribute("vehicleDto", vehicleDto);
        log.info("====>>>> editVehicle() execution");
        return "edit-vehicle";
    }


//    @PutMapping("/api/update/{number}")
//    public String updateVehicle(@RequestBody VehicleDto vehicleDto,
//                                @PathVariable("number") String number, Model model) {
//        VehicleDto updatedVehicleDto = userInterfaceService.updateVehicle(vehicleDto, number);
//        model.addAttribute("updatedVehicleDto", updatedVehicleDto);
//        log.info("====>>>> updateVehicle(" + number + ") execution.");
//        return "redirect:home/all-vehicles";
//    }

    @PutMapping("/home/update/{number}")
    public String updateVehicle(@RequestBody VehicleDto vehicleDto,
                                @PathVariable("number") String number, Model model) {
        VehicleDto updatedVehicleDto = userInterfaceService.updateVehicle(vehicleDto, number);
        model.addAttribute("updatedVehicleDto", updatedVehicleDto);
        log.info("====>>>> updateVehicle(" + number + ") execution.");
        return "redirect:home/all-vehicles";
    }


    @DeleteMapping("/home/delete/{registration}")
    public String deleteVehicleByRegistration(@PathVariable("registration") String registration) {
        log.info("====>>>> deleteVehicle(" + registration + ") execution");
        userInterfaceService.deleteVehicleByRegistrationNumber(registration);
        return "redirect:/home/find-all-vehicles";
    }


}
