package com.devian.crudtest.employee.repository;

import com.devian.crudtest.employee.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
