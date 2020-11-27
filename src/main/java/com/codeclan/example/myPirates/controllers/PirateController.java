package com.codeclan.example.myPirates.controllers;

import com.codeclan.example.myPirates.repositories.PirateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PirateController {

    @Autowired
    PirateRepo pirateRepo;
}
