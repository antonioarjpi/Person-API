package com.york.springboot.service;

import com.york.springboot.controller.MensageResponseDTO;
import com.york.springboot.entity.Person;
import com.york.springboot.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MensageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MensageResponseDTO
                .builder()
                .message("Pessoa criada com ID " + savedPerson.getId())
                .build();

    }
}
