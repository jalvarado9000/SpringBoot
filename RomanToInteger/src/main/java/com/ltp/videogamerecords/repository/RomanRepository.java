package com.ltp.videogamerecords.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.videogamerecords.entity.Roman;

public interface RomanRepository extends CrudRepository<Roman,Long> {
    
}
