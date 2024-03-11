package com.user_interface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserInterfaceController {

    @GetMapping("/csm/index")
    public String showIndex() {
        return "index";
    }
}
