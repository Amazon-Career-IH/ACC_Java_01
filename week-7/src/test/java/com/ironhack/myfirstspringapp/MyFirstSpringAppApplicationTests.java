package com.ironhack.myfirstspringapp;

import com.ironhack.myfirstspringapp.models.*;
import com.ironhack.myfirstspringapp.repositories.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class MyFirstSpringAppApplicationTests {

	@Autowired
	private SongRepository songRepository;

	@org.junit.Test
	public void shouldAddSong() {
		Song song = new Song();
		songRepository.save(song);

		assertEquals(1, songRepository.findAll().size());

	}

	@Test
	void contextLoads() {
	}

}
