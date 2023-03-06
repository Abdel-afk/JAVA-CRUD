package com.example.demo.model;

import java.util.UUID;

public class Person {

    private UUID id;

    private String name;

    public Person(String name){
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
