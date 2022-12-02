package com.ltp.videogamerecords.service;

import java.util.List;
import java.util.Optional;

import com.ltp.videogamerecords.entity.Console;

public interface ConsoleService {
    


    Console getConsole(Long id);
    void deleteConsole(Long id);
    Console saveConsole(Console console);
    List<Console> getAllConsole();

}
