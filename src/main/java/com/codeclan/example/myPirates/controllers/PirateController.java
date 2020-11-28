package com.codeclan.example.myPirates.controllers;

import com.codeclan.example.myPirates.models.Pirate;
import com.codeclan.example.myPirates.repositories.PirateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PirateController {

    @Autowired
    PirateRepo pirateRepo;

    @GetMapping(value = "/pirates")
    public ResponseEntity<List<Pirate>> getAllPirates(
            @RequestParam(name="firstName", required = false)String firstName,
            @RequestParam(name="age", required = false)Integer age){
        if(firstName != null && age !=null){
            return new ResponseEntity<>(pirateRepo.findByFirstNameIgnoreCaseAndAge(firstName, age), HttpStatus.OK);
        }
        if(firstName != null){
            return new ResponseEntity<>(pirateRepo.findByFirstName(firstName), HttpStatus.OK);
        }
        if(age != null){
            return new ResponseEntity<>(pirateRepo.findByAge(age), HttpStatus.OK);
        }
        return new ResponseEntity<>(pirateRepo.findAll(), HttpStatus.OK);
    }
}
