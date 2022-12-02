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
		Review review3 = new Review(true, false, 0);
		Review review4 = new Review(true, true, 9);

		reviewRepository.save(review1);
		reviewRepository.save(review2);
		reviewRepository.save(review3);
		reviewRepository.save(review4);



		Console console1 = new Console("ps5");
		Console console2 = new Console("ps4");
		Console console3 = new Console("xbox-series-s");
		Console console4 = new Console("wii-u");
		

		consoleRepository.save(console1);
		consoleRepository.save(console2);
		consoleRepository.save(console3);
		consoleRepository.save(console4);


		VideoGame videogame1 = new VideoGame("Elden Ring");
		VideoGame videogame2 = new VideoGame("Nioh");
		VideoGame videogame3 = new VideoGame("Guardian of the Galaxy");
		VideoGame videogame4 = new VideoGame("Mario Galaxy 2");

		videogame1.setConsole(console1);
		videogame1.setReview(review1);
		videogame2.setConsole(console2);
		videogame2.setReview(review2);

		videogame3.setConsole(console3);
		videogame3.setReview(review3);
		videogame4.setConsole(console4);
		videogame4.setReview(review4);


		videoGameRepository.save(videogame1);
		videoGameRepository.save(videogame2);
		videoGameRepository.save(videogame3);
		videoGameRepository.save(videogame4);






	}

}
