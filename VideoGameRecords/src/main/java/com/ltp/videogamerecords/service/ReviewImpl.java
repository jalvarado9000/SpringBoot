package com.ltp.videogamerecords.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ltp.videogamerecords.entity.Review;
import com.ltp.videogamerecords.entity.VideoGame;
import com.ltp.videogamerecords.repository.ReviewRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class ReviewImpl implements ReviewService {

    ReviewRepository reviewRepository;


    @Override
    public Review getReview(Long id) {
         
        Review review = reviewRepository.findById(id).get();
        return review;
    }

    @Override
    public Review saveReview(Review review) {
        
        return reviewRepository.save(review);
    }

    @Override
    public void deleteReview(Long id) {

        reviewRepository.deleteById(id);
        
        
    }
    
}
