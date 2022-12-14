package com.ltp.videogamerecords.backend.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ltp.videogamerecords.backend.entity.TwoSum;
import com.ltp.videogamerecords.backend.repository.TwoSumRepository;

import lombok.AllArgsConstructor;




@AllArgsConstructor
@Service
public class TwoSumImpl implements TwoSumService {
    
    TwoSumRepository twoSumRepository;
    
  
    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> pairs = new HashMap<>();
        int[] indeces = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int x = 0; x < nums.length; x++){

                if(x == nums.length - 1 && i == nums.length-1){
                    break;
                }
                else if(x == i && x+1 < nums.length){
                    x++;
                }

                int desiredSum = nums[i] + nums[x];
                if(desiredSum == target)
                    pairs.put(i,x);
            }

        }


            indeces = pairs.keySet()
                    .stream()
                    .mapToInt(Integer::intValue)
                    .toArray();


return indeces;
        
        

    }





    @Override
    public TwoSum save(TwoSum twoSum) {
        
        twoSum.setResult(Arrays.toString(twoSum(convertInt(twoSum.getNumbers()), twoSum.getTarget())));
        twoSumRepository.save(twoSum);
        return twoSum;
        
    }

    public int[] convertInt(String str){
        // declaring the string
        
 
        // calling replaceAll() method and split() method on
        // string
        String[] string = str.replaceAll("\\[", "")
                              .replaceAll("]", "")
                              .split(",");
 
        // declaring an array with the size of string
        int[] arr = new int[string.length];
 
        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
 
        return arr;
    }





    @Override
    public List<TwoSum> getAllTwoSum() {
        
        return (List<TwoSum>) twoSumRepository.findAll();
    }





   





    
}
