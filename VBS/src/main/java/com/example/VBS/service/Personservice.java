package com.example.VBS.service;

import com.example.VBS.Model.Person;
import com.example.VBS.repository.Personrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Personservice {
    @Autowired
    Personrepository personrepository;

    public Person addperson(Person person) {

        Person savedperson = personrepository.save(person);
        return savedperson;
    }
}
