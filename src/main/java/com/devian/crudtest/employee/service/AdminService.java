package com.devian.crudtest.employee.service;

import com.devian.crudtest.employee.model.Admin;
import com.devian.crudtest.employee.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAdmin() {
        return adminRepository.findAll();
    }
}
