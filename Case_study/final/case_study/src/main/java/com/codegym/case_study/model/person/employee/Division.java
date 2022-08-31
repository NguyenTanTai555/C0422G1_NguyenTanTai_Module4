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
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDivision;
    private String nameDivision ;

    @OneToMany(mappedBy = "division",cascade = CascadeType.ALL)
    private List<Employee> employees;
}
