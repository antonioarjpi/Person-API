package com.york.springboot;


import com.york.springboot.controller.MensageResponseDTO;
import com.york.springboot.entity.Person;
import com.york.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/v1/people")
public class PersonapiApplication {

    private PersonRepository personRepository;

    @Autowired
    public PersonapiApplication(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MensageResponseDTO createPerson(@RequestBody  Person person){
       Person savedPerson = personRepository.save(person);
        return MensageResponseDTO
                .builder()
                .message("Pessoa criada com ID "+ savedPerson.getId())
                .build();
    }
}
