package com.ltp.videogamerecords.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.util.List;

import javax.management.ConstructorParameters;
import javax.persistence.*;
import javax.persistence.Id;

import org.springframework.boot.context.properties.ConstructorBinding;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Value;



@Setter
@Getter
@Entity
@Table(name = "two_sum")
@AllArgsConstructor
@NoArgsConstructor

public class TwoSum {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private long id;


@Column(name = "number")
private String numbers;

@Column(name = "target")
private int target;

@Column(name = "result")
private String result;




    


}
