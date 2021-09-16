package com.york.springboot.controller;

import com.york.springboot.entity.Person;
import com.york.springboot.repository.PersonRepository;
import com.york.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class PersonController {

    private PersonRepository personRepository;
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MensageResponseDTO createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
}
