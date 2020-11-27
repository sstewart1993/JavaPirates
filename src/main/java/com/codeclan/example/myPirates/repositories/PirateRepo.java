package com.codeclan.example.myPirates.repositories;

import com.codeclan.example.myPirates.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepo extends JpaRepository<Pirate, Long> {

    List<Pirate> findByAge(int age);
    List<Pirate> findByAgeGreaterThan(int age);
}
