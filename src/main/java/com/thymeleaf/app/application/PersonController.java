package com.thymeleaf.app.application;

import com.thymeleaf.app.domain.Person;
import com.thymeleaf.app.domain.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;


    @PostMapping("/savePerson")
    public String savePerson(@ModelAttribute("person") Person person) {
        personService.save(person);
        return "redirect:/";
    }

    @GetMapping("/person")
    public String person(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "person";
    }
}
