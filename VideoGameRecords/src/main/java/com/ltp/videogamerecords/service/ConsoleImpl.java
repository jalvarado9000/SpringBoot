package com.ltp.videogamerecords.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ltp.videogamerecords.entity.Console;
import com.ltp.videogamerecords.repository.ConsoleRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service

public class ConsoleImpl implements ConsoleService {

    ConsoleRepository consoleRepository;

    @Override
    public Console getConsole(Long id) {
        
         Console console = consoleRepository.findById(id).get();
         return console;
    }

    


    
    @Override
    public void deleteConsole(Long id) {
        
        consoleRepository.deleteById(id);
        
    }
     
     

    @Override
    public Console saveConsole(Console console) {
        
        return consoleRepository.save(console);
        
         
    }

    @Override
    public List<Console> getAllConsole() {
        
        return (List<Console>) consoleRepository.findAll();
        
    }

    
    
}
