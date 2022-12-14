package com.ltp.videogamerecords.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.videogamerecords.backend.entity.TwoSum;


public interface TwoSumRepository extends CrudRepository<TwoSum,Long> {
    
}
