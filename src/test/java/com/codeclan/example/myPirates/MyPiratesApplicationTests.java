package com.codeclan.example.myPirates;

import com.codeclan.example.myPirates.models.Pirate;
import com.codeclan.example.myPirates.repositories.PirateRepo;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class MyPiratesApplicationTests {

	@Autowired
	PirateRepo pirateRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindPirateByAge(){
		List<Pirate> found = pirateRepo.findByAge(34);
		assertEquals(1, found.size());
	}

	@Test
	public void canFindPirateOlderThan30(){
		List<Pirate> found = pirateRepo.findByAgeGreaterThan(30);
		assertEquals(2, found.size());
	}

	@Test
	public void canFindPirateYoungerThan30(){
		List<Pirate> found = pirateRepo.findByAgeLessThan(30);
		assertEquals(1, found.size());
	}

	@Test
	public void canFindByFirstName(){
		List<Pirate> found = pirateRepo.findByFirstName("Jack");
		assertEquals(1, found.size());
	}

	@Test
	public void canFindByLastName(){
		List<Pirate> found = pirateRepo.findByLastName("Kid");
		assertEquals(1, found.size());
	}

	@Test
	public void canFindByNameAndAge(){
		List<Pirate> found = pirateRepo.findByFirstNameIgnoreCaseAndAge("billie", 12);
		assertEquals(1, found.size());
	}

}
