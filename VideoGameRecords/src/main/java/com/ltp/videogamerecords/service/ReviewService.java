package com.ltp.videogamerecords.service;

import java.util.Optional;

import com.ltp.videogamerecords.entity.Review;
import com.ltp.videogamerecords.entity.VideoGame;

public interface ReviewService {
    Review getReview(Long id);
    Review saveReview(Review review);
    void deleteReview(Long id);
    
    
}
