package com.codegym.phonemanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="smartphones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SmartPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String producer;
    private String model;
    private double price;

    @Override
    public String toString() {
        return producer+": "+model+" with price "+price;
    }
}
