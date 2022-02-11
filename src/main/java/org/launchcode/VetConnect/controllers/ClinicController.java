package org.launchcode.VetConnect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClinicController {

    @GetMapping(value = "add")
    public String addAClinicForm() {
        return "add-a-clinic";
    }

    @PostMapping(value = "add")
    public String addAClinicRequest() {
        return "index";
    }

}
