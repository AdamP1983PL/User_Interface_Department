package com.user_interface.controller;

import com.user_interface.dto.customer.CustomerDto;
import com.user_interface.service.customer_service.UserInterface_CustomerServiceImpl;
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
@RequestMapping("/home")
public class UserInterface_CustomerController {

    private UserInterface_CustomerServiceImpl userInterface_customerServiceImpl;

    @GetMapping("/find-all-customers")
    public String findAllCustomers(Model model) {
        List<CustomerDto> customerDtoList = userInterface_customerServiceImpl.findAllCustomers();
        model.addAttribute("customerDtoList", customerDtoList);
        log.info("====>>>> findAllCustomers execution.");
        return "customer/all-customers";
    }

    @GetMapping("/details/customer/{id}")
    public String showCustomerDetails(@PathVariable("id") Long id, Model model) {
        CustomerDto customerDetails = userInterface_customerServiceImpl.findCustomerById(id);
        model.addAttribute("customerDetails", customerDetails);
        log.info("====>>>>showCustomerDetails(" + id + ") execution.");
        return "customer/customer-details";
    }

    @GetMapping("/add-customer")
    public String showAddCustomerPage(Model model) {
        CustomerDto customerDto = new CustomerDto();
        model.addAttribute("customerDto", customerDto);
        log.info("====>>>>showAddCustomerPage() execution.");
        return "customer/add-new-customer";
    }

    @PostMapping("/create-customer")
    public String saveNewCustomer(@Valid @ModelAttribute("customerDto") CustomerDto customerDto,
                                  BindingResult result, Model model) {
        if (result.hasErrors()) {
            log.info("====>>>> saveNewCustomer() result.hasError() execution.");
            model.addAttribute("customerDto", customerDto);
            return "customer/add-new-customer";
        }
        userInterface_customerServiceImpl.createCustomer(customerDto);
        log.info("====>>>> saveNewCustomer() execution.");
        return "redirect:/home/find-all-customers";
    }

    @DeleteMapping("/delete/customer/{id}")
    public String deleteCustomerById(@PathVariable("id") Long id) {
        userInterface_customerServiceImpl.deleteCustomer(id);
        log.info("====>>>> deleteCustomerById(\"id: " + id + "\") execution.");
        return "redirect:/home/find-all-customers";
    }
}












