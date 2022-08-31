package com.codegym.case_study.model.person.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPosition;
    private String namePosition;
    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private List<Employee> employees;
}
