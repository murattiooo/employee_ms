package com.fs.employeems.service;

import com.fs.employeems.dao.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> getALlEmployee();

    void deleteEmployee(Long id);

    List<Employee> findByNameAndSurname(String name, String surname);

    Employee updateEmployee(Employee employee);
}
