package com.example.phones.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "smartphones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Smartphone {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String producer;
    private String model;
    private double price ;
}
