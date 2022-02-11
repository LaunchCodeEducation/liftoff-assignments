package org.launchcode.VetConnect.controllers;

import org.launchcode.VetConnect.models.dto.AddClinicDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class ClinicController {

    @GetMapping(value = "add")
    public String addAClinicForm(Model model) {
        model.addAttribute(new AddClinicDTO());

        return "add-a-clinic";
    }

    @PostMapping(value = "add")
    public String addAClinicRequest(@ModelAttribute @Valid AddClinicDTO addClinicDTO, Errors errors, HttpServletRequest request, Model model) {
        if(errors.hasErrors()) {
            return "add-a-clinic";
        }

//        ToDO
//        Check for existing clinic
//

        return "redirect:";
    }

}
