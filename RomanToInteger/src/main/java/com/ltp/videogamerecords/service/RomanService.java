package com.ltp.videogamerecords.service;

import java.util.List;

import com.ltp.videogamerecords.entity.Roman;

public interface RomanService {
    int romanToInt(String str);
    Roman save(Roman roman);
    List<Roman> getAllRoman();
    
    
}
