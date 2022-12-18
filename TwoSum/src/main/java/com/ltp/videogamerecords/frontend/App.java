package com.ltp.videogamerecords.frontend;

import org.springframework.web.client.RestTemplate;
import org.jboss.logging.BasicLogger;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import com.ltp.videogamerecords.frontend.entity.*;
import com.ltp.videogamerecords.frontend.entity.TwoSum;

import java.util.*;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;

public class App {

    public static void main(String[] args) {

        char option = 'Y';

    /*
    Example:
    nums = "[3,2,4]";
    int target = 6;
     */
        

    do{
    
       Scanner in = new Scanner(System.in);
       int selection = menuSelector();
        
        switch(selection){
            case 1:{
                TwoSum twoSum = calculateArrayTarget();
                sendMoney(twoSum);
                break;
            }
            case 2:printSendMoney();
            break;
            //case 3: deleteSendMoney();
            case 4: option = continueWithProgram();
            break;
            default: System.out.println("Option was not found");

        }

       
    }while(option == 'Y');
  
    }




    public static char continueWithProgram(){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to continue? Yes('Y') or No('N')");
        char option = in.nextLine().toUpperCase().charAt(0);
        return option;
        
    }

    public static TwoSum calculateArrayTarget(){

        Scanner in = new Scanner(System.in);
        System.out.println("Please write a array");
        String nums = "[" + in.nextLine() + "]";
        System.out.println("Please write the target");
        int target = in.nextInt();
        return new TwoSum(nums,target);

    }

    public static int menuSelector(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please select options");
        System.out.println("Select 1 to calculate");
        System.out.println("Select 2 print results");
        System.out.println("Select 3 to delete results");
        System.out.println("Select 4 to Exit Program");
        int selection = in.nextInt();
        return selection;

    }

    

    public static Class<? extends TwoSum> sendMoney(TwoSum twoSum) {
        final RestTemplate restTemplate = new RestTemplate();
        final String API_BASE_URL = "http://localhost:8080/sum";
    
        try {
            HttpEntity<TwoSum> request = new HttpEntity<>(twoSum);
            ResponseEntity<TwoSum> response = restTemplate.exchange(
                    API_BASE_URL,
                    HttpMethod.POST,
                    request,
                    TwoSum.class
            );
    
            if (response.getStatusCode().is2xxSuccessful()) {
                System.out.println("Transaction was successful.");
                return response.getBody().getClass();
            } else {
                // handle error
                System.out.println("Error occurred while processing transaction: " + response.getStatusCode());
                return null;
            }
        } catch (Exception e) {
            // handle exception
            System.out.println("Exception occurred while processing transaction: " + e.getMessage());
            return null;
        }
    }

    public static void printSendMoney() {

    final RestTemplate restTemplate = new RestTemplate();
    final String API_BASE_URL = "http://localhost:8080/sum/all";
    
    ResponseEntity<List<TwoSum>> response = restTemplate.exchange(
            API_BASE_URL,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<TwoSum>>() {}
    );
    
    List<TwoSum> objects = response.getBody();
    
    for (TwoSum object : objects) {
        System.out.println(object);
    
    }

    }


    private static HttpEntity<TwoSum> makeTransferEntity(TwoSum twoSum) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //headers.setBearerAuth(authToken);
        return new HttpEntity<>(twoSum, headers);
    }


    private static HttpEntity<Void> makeAuthEntity () {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //headers.setBearerAuth(authToken);
        return new HttpEntity<>(headers);
    }


    


    
}
