package com.ltp.videogamerecords.backend;

import java.util.Arrays;
import java.util.function.ToDoubleBiFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.ltp.videogamerecords.backend.repository.TwoSumRepository;
import com.ltp.videogamerecords.backend.service.TwoSumService;



@Component
@SpringBootApplication
public class TwoSumApplication implements CommandLineRunner{

	TwoSumService twoSumService;
	

	public static void main(String[] args) {
		SpringApplication.run(TwoSumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}

}
