package com.ltp.videogamerecords.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.videogamerecords.entity.Roman;
import com.ltp.videogamerecords.service.RomanService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/roman")
@AllArgsConstructor
public class RomanController {

    RomanService romanService;

    @GetMapping("/int")
    public ResponseEntity<List<Roman>> getAllRomanValues(){
        return new ResponseEntity<>(romanService.getAllRoman(),HttpStatus.OK);
    }
    

    @PostMapping
    public ResponseEntity<Roman> saveRoman(@RequestBody Roman roman){
        return new ResponseEntity<>(romanService.save(roman), HttpStatus.CREATED);
    }


}
