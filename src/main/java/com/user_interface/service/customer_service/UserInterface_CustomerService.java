package com.user_interface.service.customer_service;

import com.user_interface.dto.customer.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "${feign.client.customer.name}")
public interface UserInterface_CustomerService {

    List<CustomerDto> findAllCustomers();
    CustomerDto findCustomerById(@PathVariable("id") Long id);
    List<CustomerDto> findCustomersByName(@PathVariable("name") String name);
    CustomerDto createCustomer(@RequestBody CustomerDto customerDto);
    CustomerDto updateCustomer(@RequestBody CustomerDto customerDto, @PathVariable("id") Long id);
    Void deleteCustomer(@PathVariable("id") Long id);

}
