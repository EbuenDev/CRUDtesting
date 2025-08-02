package com.devian.crudtest.employee.controller;

import com.devian.crudtest.employee.model.Employee;
import com.devian.crudtest.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {this.employeeService = employeeService;}

    @GetMapping
    public List<Employee> getEmployee() {
        return employeeService.getEmployees();
    }

}
