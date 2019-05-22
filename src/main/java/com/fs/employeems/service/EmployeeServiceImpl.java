package com.fs.employeems.service;

import com.fs.employeems.dao.Employee;
import com.fs.employeems.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    @Override
    public List<Employee> getALlEmployee() {

        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(Long id) {

        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findByNameAndSurname(String name, String surname) {
        return employeeRepository.findByNameAndSurname(name, surname);
    }

    @Override
    public  Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}

