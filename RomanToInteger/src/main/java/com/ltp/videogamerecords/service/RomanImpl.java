package com.ltp.videogamerecords.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ltp.videogamerecords.entity.Roman;
import com.ltp.videogamerecords.repository.RomanRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RomanImpl implements RomanService {
    

    RomanRepository romanRepository;


    @Override
    public int romanToInt(String str) {
        Map<Character,Integer> roman = new HashMap<>();
            roman.put('I',1);
            roman.put('V',5);
            roman.put('X',10);
            roman.put('L', 50);
            roman.put('C',100);
            roman.put('D',500);
            roman.put('M',1000);

            char[] charRome = str.toCharArray();
            int[] intRome = new int[charRome.length];

            for(int i = 0; i < intRome.length; i++)
                intRome[i] = roman.get(charRome[i]);

            int sum = 0;

            for(int i = 0; i < intRome.length; i++){

                if(i == intRome.length-1){
                    sum+= intRome[i];
                }
                else if(intRome[i] >= intRome[i+1]) sum+= intRome[i];
                else sum-= intRome[i];
        }

            


        return sum;

    }

    @Override
    public Roman save(Roman roman) {
        roman.setConversion(romanToInt(roman.getRoman()));
        romanRepository.save(roman);
        return roman;
    }

    @Override
    public List<Roman> getAllRoman() {
        
        return (List<Roman>)romanRepository.findAll();
    }
    


    
}
