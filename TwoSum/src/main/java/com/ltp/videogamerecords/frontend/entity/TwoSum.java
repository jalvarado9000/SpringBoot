package com.ltp.videogamerecords.frontend.entity;
import lombok.*;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TwoSum {

private long id;
private String numbers;
private int target;
private String result;

public TwoSum(String numbers, int target){
    this.numbers = numbers;
    this.target = target;
}


}
