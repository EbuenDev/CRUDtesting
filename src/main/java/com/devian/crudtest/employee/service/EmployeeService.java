package com.devian.crudtest.employee.service;

import com.devian.crudtest.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    public  List<Employee> getEmployees() {
        return List.of(
                new Employee(
                        1L,
                        "Aiai",
                        "Delas alas",
                        21,
                        "Staff")
        );
    }
}
