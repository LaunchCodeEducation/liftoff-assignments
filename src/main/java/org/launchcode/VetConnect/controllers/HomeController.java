package org.launchcode.VetConnect.controllers;


import org.launchcode.VetConnect.data.ClinicRepository;
import org.launchcode.VetConnect.models.Clinic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ClinicRepository clinicRepository;

    @GetMapping(value="")
    public String displayIndex() {
        return "index";
    }


    @PostMapping(value="search-results")
    public String displaySearchResults(Model model, @RequestParam String searchType, @RequestParam String term)
    {
        if (searchType.isEmpty() || term.isEmpty())
        {
            model.addAttribute("results_heading", "No search results were found.  Please enter a search term.");
        }
        else
        {
            List<Clinic> results = new ArrayList<>();
            if (searchType.equals("city")) {
                results = clinicRepository.findByCityIgnoreCaseContaining(term);
            }
            else if (searchType.equals("state")) {
                results = clinicRepository.findByStateIgnoreCaseContaining(term);
            }
            if (results.isEmpty()) {
                model.addAttribute("results_heading", "No search results found for " + searchType + ": '" + term + "'");
            }
            else {
                // search results were found!
                model.addAttribute("results_heading", "Search results for " + searchType + " name: '" + term + "'");
                model.addAttribute("clinics", results);
            }
        }
        return "search-results";
    }

    @GetMapping("clinic-profile")
    public String displayClinicProfile(@RequestParam Integer clinicId, Model model)
    {
        model.addAttribute("clinic", clinicRepository.findById(clinicId));
        return ("clinic-profile");
    }
}
