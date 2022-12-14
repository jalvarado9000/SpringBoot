package com.ltp.videogamerecords.backend.service;

import java.util.List;

import com.ltp.videogamerecords.backend.entity.TwoSum;

public interface TwoSumService  {

    int[] twoSum(int[] nums, int target);
    TwoSum save(TwoSum twoSum);
    int[] convertInt(String string);
    List<TwoSum> getAllTwoSum();
    
}
