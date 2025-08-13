package com.devian.crudtest.employee.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Employee")
@Getter
@Setter
@Builder
public class Employee { // This represents a blueprint on the database table of Employee.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    // Column of id

    // Column for User Details
    private String firstName;

    private String lastName;

    private int age;



    // User Login Details

    @Column(nullable = false, unique = true, length = 100)
    private String username;


    @Column(nullable = false, length = 100)
    private String password;


    @Column(nullable = false, length = 50)
    private String role;

}
