package com.ltp.videogamerecords.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.videogamerecords.service.TwoSumService;
import com.ltp.videogamerecords.entity.TwoSum;

import java.util.List;

import javax.validation.Valid;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/sum")
public class TwoSumController {



TwoSumService twoSumService;

    
@GetMapping("/all")
public ResponseEntity<List<TwoSum>> getAllResults(){
    return new ResponseEntity<>(twoSumService.getAllTwoSum(),HttpStatus.OK);
}

@PostMapping
public ResponseEntity<TwoSum> saveTwoSum(@Valid @RequestBody TwoSum twoSum){
    return new ResponseEntity<>(twoSumService.save(twoSum), HttpStatus.CREATED);
}



}
