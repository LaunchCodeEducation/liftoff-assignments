package org.launchcode.VetConnect.controllers;

import org.launchcode.VetConnect.models.Clinic;
import org.launchcode.VetConnect.models.data.ClinicRepository;
import org.launchcode.VetConnect.models.dto.AddClinicDTO;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    ClinicRepository clinicRepository;

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

        Clinic existingClinic = clinicRepository.findByName(addClinicDTO.getName());

        if(existingClinic != null) {
            errors.rejectValue("name", "name.alreadyexists", "A clinic with that name already exists");
            return "add-a-clinic";
        }

        int emergency = 0;
        if (addClinicDTO.getEmergency() != null) {
            emergency = 1;
        }

        Clinic newClinic = new Clinic(addClinicDTO.getName(), addClinicDTO.getPhoneNumber(), addClinicDTO.getAddress(), addClinicDTO.getCity(), addClinicDTO.getState(), addClinicDTO.getZip(), addClinicDTO.getWebsite(), emergency);
        clinicRepository.save(newClinic);

        return "redirect:";
    }

}
