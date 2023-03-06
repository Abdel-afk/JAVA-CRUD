package com.example.demo.controlers;

import com.example.demo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonControler {
    @GetMapping("/check")
    public String check(){
        return "good";
    }

    @GetMapping
    public Person getPerson(){
        var person = new Person("Abdel");
        return person;
    }
}
