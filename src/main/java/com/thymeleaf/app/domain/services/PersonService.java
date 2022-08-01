package com.thymeleaf.app.domain.services;

import com.thymeleaf.app.domain.Person;

import java.util.List;

public interface PersonService {

    Person save(Person person);

    List<Person> listPerson();

    Person getPersonById(Long idPerson);

}
