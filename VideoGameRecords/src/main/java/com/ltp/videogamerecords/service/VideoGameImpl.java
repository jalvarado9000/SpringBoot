package com.ltp.videogamerecords.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ltp.videogamerecords.entity.Console;
import com.ltp.videogamerecords.entity.VideoGame;
import com.ltp.videogamerecords.entity.Review;
import com.ltp.videogamerecords.repository.ConsoleRepository;
import com.ltp.videogamerecords.repository.ReviewRepository;
import com.ltp.videogamerecords.repository.VideoGameRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class VideoGameImpl implements VideoGameService{

    ConsoleRepository consoleRepository;
    ReviewRepository vGExperienceRepository;
    VideoGameRepository videoGameRepository;

    @Override
    public VideoGame saveVideoGame(Long console_id, Long review_id, VideoGame videogame) {

        Console console = consoleRepository.findById(console_id).get();
        Review vGExperience = vGExperienceRepository.findById(review_id).get();
        videogame.setConsole(console);
        videogame.setVGExperience(vGExperience);
        return videoGameRepository.save(videogame);
    }

    @Override
    public VideoGame getVideoGame(Long console_id,Long review_id) {
        return videoGameRepository.findByConsoleIdAndReviewId(console_id, review_id).get();
        
    }

    @Override
    public void deleteVideoGame(Long id) {
       VideoGame videoGame = videoGameRepository.findById(id).get();
       videoGameRepository.delete(videoGame);
        
    }


    @Override
    public List<VideoGame> getAllVideoGame() {
        return (List<VideoGame>) videoGameRepository.findAll();
        
    }

   
    
}
