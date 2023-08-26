package com.example.VBS.Controller;

import com.example.VBS.Model.Person;
import com.example.VBS.service.Personservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    Personservice personservice;
    // add a person
    @PostMapping("/add")
    public ResponseEntity addperson(@RequestBody Person person)
    {
        try {
            Person personresponse = personservice.addperson(person);
            return new ResponseEntity(personresponse, HttpStatus.CREATED);
        }
        catch (Exception e)
        {
            return new ResponseEntity("Email Id already exists", HttpStatus.BAD_REQUEST);
        }
    }

}
