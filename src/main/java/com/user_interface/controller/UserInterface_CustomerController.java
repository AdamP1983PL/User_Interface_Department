package com.user_interface.controller;

import com.user_interface.dto.customer.CustomerDto;
import com.user_interface.service.customer_service.UserInterface_CustomerServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/home")
public class UserInterface_CustomerController {

    private UserInterface_CustomerServiceImpl userInterface_customerServiceImpl;

    @GetMapping("/find-all-customers")
    public String findAllCustomers(Model model) {
        List<CustomerDto> customerDtoList = userInterface_customerServiceImpl.findAllCustomers();
        model.addAttribute("customerDtoList", customerDtoList);
        log.info("====>>>> findAllCustomers execution");
        return "customer/all-customers";
    }

}
