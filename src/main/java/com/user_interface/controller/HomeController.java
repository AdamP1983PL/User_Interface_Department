package com.user_interface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHome() {
        return "home";
    }

    @GetMapping("/home/vehicle/user-interface")
    public String showVehicleDepartmentUI() {
        return "vehicle/user-interface";
    }

    @GetMapping("/home/customer/user-interface")
    public String showCustomerDepartmentUI() {
        return "customer/user-interface";
    }

    @GetMapping("/home/service-operations/user-interface")
    public String showServiceOperationsDepartment() {
        return "service_operations/user-interface";
    }

}
