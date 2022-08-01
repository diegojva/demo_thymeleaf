package com.thymeleaf.app.domain.services.impl;

import com.thymeleaf.app.domain.Person;
import com.thymeleaf.app.domain.services.PersonService;
import com.thymeleaf.app.infrastracture.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepo personRepo;

    @Override
    public Person save(Person person) {
        return personRepo.save(person);
    }

    @Override
    public List<Person> listPerson() {
        return personRepo.findAll();
    }

    @Override
    public Person getPersonById(Long idPerson) {
        return personRepo.findById(idPerson).orElse(null);
    }
}
