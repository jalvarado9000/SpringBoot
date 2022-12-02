package com.ltp.videogamerecords.service;

import java.util.Optional;

import com.ltp.videogamerecords.entity.Review;
import com.ltp.videogamerecords.entity.VideoGame;

import java.util.*;

public interface VideoGameService {

    VideoGame saveVideoGame(Long console_id, Long vgexperience_id,VideoGame videogame);
    VideoGame getVideoGame(Long console_id, Long vgexperience_id);
    void deleteVideoGame(Long id);
    List<VideoGame> getAllVideoGame();
    
    
}
