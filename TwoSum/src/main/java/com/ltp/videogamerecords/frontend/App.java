package com.ltp.videogamerecords.frontend;

import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

import org.jboss.logging.BasicLogger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import com.ltp.videogamerecords.frontend.entity.*;
import com.ltp.videogamerecords.frontend.entity.TwoSum;

import antlr.collections.List;

import org.springframework.http.*;

public class App {

    public static void main(String[] args) {


    String nums = "[3,2,4]";

    int target = 6;


    TwoSum twoSum = new TwoSum(nums,target);

    sendMoney(twoSum);
  



    }

    public static String sendMoney(TwoSum twoSum) {

        final RestTemplate restTemplate = new RestTemplate();

        final String API_BASE_URL = "http://localhost:8080/sum";

        String success = "\nYour transaction was successful.";
        //try to get the response from the server.
        try {
            restTemplate.exchange(API_BASE_URL, HttpMethod.POST, makeTransferEntity(twoSum),ResponseEntity.class);
            

        }//catch exception if server error response or I/O exception occurs.
        catch (RestClientResponseException | ResourceAccessException e ) {
            System.out.println("Anuel");

        }
        //Prints and returns message of successful payments transfer
        System.out.println(success);
        return success;
    }


    private static HttpEntity<TwoSum> makeTransferEntity(TwoSum twoSum) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //headers.setBearerAuth(authToken);
        return new HttpEntity<>(twoSum, headers);
    }

    


    
}
