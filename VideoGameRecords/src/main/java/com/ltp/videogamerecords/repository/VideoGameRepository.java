package com.ltp.videogamerecords.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ltp.videogamerecords.entity.Review;
import com.ltp.videogamerecords.entity.VideoGame;

public interface VideoGameRepository extends CrudRepository<VideoGame,Long>{

    Optional<VideoGame> findByConsoleIdAndReviewId(Long consoleId, Long reviewId);
    
}
