package com.user_interface.controller;

import com.user_interface.client.CustomerApiClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
@AllArgsConstructor
public class UserInterface_CustomerController {

    private CustomerApiClient customerApiClient;

}
