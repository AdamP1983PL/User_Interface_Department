package com.user_interface.client;

import com.user_interface.dto.customer.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "${customer-department.application.name}")
public interface CustomerApiClient {

    @GetMapping("/")
    List<CustomerDto> findAllCustomers();

    @GetMapping("/{id}")
    CustomerDto findCustomerById(@PathVariable("id") Long id);

    @GetMapping("/name/{name}")
    List<CustomerDto> findCustomersByName(@PathVariable("name") String name);

    @PostMapping("/")
    CustomerDto createCustomer(@RequestBody CustomerDto customerDto);

    @PutMapping("/{id}")
    CustomerDto updateCustomer(@RequestBody CustomerDto customerDto, @PathVariable Long id);

    @DeleteMapping("/{id}")
    Void deleteCustomer(@PathVariable("id") Long id);

}
