package com.fs.employeems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
