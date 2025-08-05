package com.devian.crudtest.employee.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Employee")
@Getter
@Setter
public class Employee { // This represents a blueprint on the database table of Employee.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    // Column of id

    private String firstName;   // Column of firstname

    private String lastName;    // Column of lastname

    private int age;    // Column of age

    private String role;    // Column of role

//    private LocalDateTime createdAt;

}
