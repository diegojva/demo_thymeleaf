package com.thymeleaf.app.application;

import com.thymeleaf.app.domain.Person;
import com.thymeleaf.app.domain.Vehicle;
import com.thymeleaf.app.domain.services.PersonService;
import com.thymeleaf.app.domain.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private PersonService personService;

    @PostMapping("/saveVehicle")
    public String savePerson(@ModelAttribute("vehicle") Vehicle vehicle) {
        vehicleService.save(vehicle);
        return "redirect:/";
    }

    @GetMapping("/vehicle")
    public String person(Model model) {
        Vehicle vehicle = new Vehicle();
        List<Person> listPerson = personService.listPerson();
        model.addAttribute("vehicle", vehicle);
        model.addAttribute("listPerson", listPerson);
        return "vehicle";
    }

}
