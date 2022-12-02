package com.ltp.videogamerecords.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.videogamerecords.entity.Review;
import com.ltp.videogamerecords.entity.VideoGame;


public interface ReviewRepository extends CrudRepository<Review,Long>{
    
}
