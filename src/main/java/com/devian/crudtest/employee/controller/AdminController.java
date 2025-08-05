package com.devian.crudtest.employee.controller;


import com.devian.crudtest.employee.model.Admin;
import com.devian.crudtest.employee.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    public AdminController (AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping
    public List<Admin> getAdmin() {
        return adminService.getAdmin();
    }


}
