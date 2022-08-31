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
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEducation;

    private String nameEducation;

    @OneToMany(mappedBy = "educationDegree",cascade = CascadeType.ALL)
    private List<Employee> employees;

}
