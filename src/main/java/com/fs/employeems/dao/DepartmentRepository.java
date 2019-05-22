package com.fs.employeems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department>findByName (String name);


}
