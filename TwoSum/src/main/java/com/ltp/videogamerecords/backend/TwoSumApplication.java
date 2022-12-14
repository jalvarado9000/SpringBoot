package com.ltp.videogamerecords.backend;

import java.util.Arrays;
import java.util.function.ToDoubleBiFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.ltp.videogamerecords.backend.repository.TwoSumRepository;
import com.ltp.videogamerecords.backend.service.TwoSumService;



@Component
@SpringBootApplication
public class TwoSumApplication implements CommandLineRunner{

	TwoSumService twoSumService;
	

	public static void main(String[] args) {
		SpringApplication.run(TwoSumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		 
        int[] nums = {2,7,11,15};
        int[] nums1 = {3,2,4};
        int[] nums2 = {3,3};
         
        int[] nums3 = {-1,-2,-3,-4,-5};
        int[] nums4 = {2,4,11,3};
        int target = 9;
        int target1 = 6;
        int target2 = -8;

        
        //TwoSum twoSum1 = new TwoSum(Arrays.toString(nums),target);
        //TwoSum twoSum2 = new TwoSum(Arrays.toString(nums1),target1);
        //TwoSum twoSum3 = new TwoSum(Arrays.toString(nums2),target2,"[2,4]");

		//twoSumService.save(twoSum1);
        //twoSumRepository.save(twoSum1);
        //twoSumRepository.save(twoSum2);
		//System.out.println(Arrays.toString(twoSum1.getNumber()));
		




	}

}
