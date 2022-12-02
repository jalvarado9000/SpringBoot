package com.ltp.videogamerecords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ltp.videogamerecords.entity.Console;
import com.ltp.videogamerecords.entity.Review;
import com.ltp.videogamerecords.entity.VideoGame;
import com.ltp.videogamerecords.repository.ConsoleRepository;
import com.ltp.videogamerecords.repository.ReviewRepository;
import com.ltp.videogamerecords.repository.VideoGameRepository;




@SpringBootApplication
public class VideoGameRecordsApplication implements CommandLineRunner{

	@Autowired
	VideoGameRepository videoGameRepository;
	@Autowired
	ReviewRepository reviewRepository;
	@Autowired
	ConsoleRepository consoleRepository;

	public static void main(String[] args) {
		SpringApplication.run(VideoGameRecordsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Review review1 = new Review(true, true, 10);
		Review review2 = new Review(true, false, 4);

		reviewRepository.save(review1);
		
		reviewRepository.save(review2);



		Console console1 = new Console("PS5", "Sony");
		Console console2 = new Console("PS4","Sony");

		consoleRepository.save(console1);
		
		consoleRepository.save(console2);

		VideoGame videogame1 = new VideoGame("Elden Ring");
		VideoGame videogame2 = new VideoGame("Nioh");

		videogame1.setConsole(console1);
		videogame1.setReview(review1);
		videogame2.setConsole(console2);
		videogame2.setReview(review2);

		videoGameRepository.save(videogame1);
		videoGameRepository.save(videogame2);






	}

}
