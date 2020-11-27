package com.codeclan.example.myPirates.components;

import com.codeclan.example.myPirates.models.Pirate;
import com.codeclan.example.myPirates.repositories.PirateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PirateRepo pirateRepo;

    public DataLoader(){}

    public void run(ApplicationArguments args) {
        Pirate pirate1 = new Pirate("Jack", "Sparrow", 34);
        pirateRepo.save(pirate1);
        Pirate pirate2 = new Pirate("Black", "Beard", 54);
        pirateRepo.save(pirate2);
        Pirate pirate3 = new Pirate("Billie", "Kid", 12);
        pirateRepo.save(pirate3);
    }
}
