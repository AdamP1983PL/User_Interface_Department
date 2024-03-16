package com.user_interface.service.customer_service;

import com.user_interface.client.CustomerApiClient;
import com.user_interface.dto.customer.CustomerDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserInterface_CustomerServiceImpl implements UserInterface_CustomerService {

    private CustomerApiClient customerApiClient;

    @Override
    public List<CustomerDto> findAllCustomers() {
        return customerApiClient.findAllCustomers();
    }

    @Override
    public CustomerDto findCustomerById(Long id) {
        return customerApiClient.findCustomerById(id);
    }

    @Override
    public List<CustomerDto> findCustomersByName(String name) {
        return null;
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return customerApiClient.createCustomer(customerDto);
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto, Long id) {
        return null;
    }

    @Override
    public Void deleteCustomer(Long id) {
        return customerApiClient.deleteCustomer(id);
    }
}
