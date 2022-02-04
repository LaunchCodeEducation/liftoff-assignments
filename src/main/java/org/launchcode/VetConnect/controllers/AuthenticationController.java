package org.launchcode.VetConnect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

    @GetMapping(value="login")
    public String login() {
        return "login";
    }

    @GetMapping(value="register")
    public String register() {
        return "register";
    }

}
