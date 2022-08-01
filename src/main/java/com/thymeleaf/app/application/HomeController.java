package com.thymeleaf.app.application;

import com.thymeleaf.app.domain.services.PersonService;
import com.thymeleaf.app.domain.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private PersonService personService;

    @Autowired
    private VehicleService vehicleService;


    @GetMapping()
    public String index(Model model) {
        model.addAttribute("people", personService.listPerson());
        model.addAttribute("vehicles", vehicleService.listVehicle());
        return "index";
    }
}
