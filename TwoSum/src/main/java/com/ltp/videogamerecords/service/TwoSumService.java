package com.ltp.videogamerecords.service;

import java.util.List;

import com.ltp.videogamerecords.entity.TwoSum;

public interface TwoSumService  {

    int[] twoSum(int[] nums, int target);
    TwoSum save(TwoSum twoSum);
    int[] convertInt(String string);
    List<TwoSum> getAllTwoSum();
    
}
