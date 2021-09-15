package com.york.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1/people")
public class PersonapiApplication {
    @GetMapping
    public String getBook(){

        return "Api Test, Antonio Francisco de sousa araujo";
    }
}
