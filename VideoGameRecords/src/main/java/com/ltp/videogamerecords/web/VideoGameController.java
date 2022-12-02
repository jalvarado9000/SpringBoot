package com.ltp.videogamerecords.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.videogamerecords.entity.VideoGame;
import com.ltp.videogamerecords.service.VideoGameService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("/videogames")
public class VideoGameController {

    VideoGameService videoGameService;

   
    @GetMapping("/all")
    public ResponseEntity<List<VideoGame>> getVideoGames(){
        return new ResponseEntity<>(videoGameService.getAllVideoGame(),HttpStatus.OK);
    }
    
}
