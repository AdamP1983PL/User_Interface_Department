package com.user_interface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserInterfaceController {

    @GetMapping("/login")
    public String showIndex() {
        return "login";
    }

    @GetMapping("/home")
    public String showHome() {
        return "home";
    }
}
