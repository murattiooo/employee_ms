package com.fs.employeems.service;

import com.fs.employeems.dao.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);
   // Collection<? extends Employee>getAllEmployees();
    List<Employee> getALlEmployee();
    void deleteEmployee (Long id);
    List<Employee> findByNameAndSurname(String name, String surname);
    Employee updateEmployee(Employee employee);




}
