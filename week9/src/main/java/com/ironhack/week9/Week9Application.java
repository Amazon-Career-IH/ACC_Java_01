package com.ironhack.week9;

import com.ironhack.week9.enums.*;
import com.ironhack.week9.models.*;
import com.ironhack.week9.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.*;

@SpringBootApplication
public class Week9Application implements CommandLineRunner {

	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(Week9Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
