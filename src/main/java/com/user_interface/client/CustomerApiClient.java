package com.user_interface.client;

import com.user_interface.dto.customer.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "${customer-department.application.name}")
public interface CustomerApiClient {

    @GetMapping("/customer/")
    List<CustomerDto> findAllCustomers();

    @GetMapping("/customer/{id}")
    CustomerDto findCustomerById(@PathVariable("id") Long id);

    @GetMapping("/customer/name/{name}")
    List<CustomerDto> findCustomersByName(@PathVariable("name") String name);

    @PostMapping("/customer/")
    CustomerDto createCustomer(@RequestBody CustomerDto customerDto);

    @PutMapping("/customer/{id}")
    CustomerDto updateCustomer(@RequestBody CustomerDto customerDto, @PathVariable("id") Long id);

    @DeleteMapping("/customer/{id}")
    Void deleteCustomer(@PathVariable("id") Long id);

}
