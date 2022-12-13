package com.ltp.videogamerecords.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.videogamerecords.entity.TwoSum;


public interface TwoSumRepository extends CrudRepository<TwoSum,Long> {
    
}
