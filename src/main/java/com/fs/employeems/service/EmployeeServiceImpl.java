package com.fs.employeems.service;

import com.fs.employeems.dao.Employee;
import com.fs.employeems.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

//    @Override
//    public Collection<? extends Employee>getAllEmployees(){
//        List<Employee> employeeList=new ArrayList<>();
//        employeeRepository.findAll().forEach(employeeList::add);
//        return employeeList;
//    }


//    @Override
//    public List<Employee> getAllEmployees(Long employeeId) {
//        List<Employee> employeeList = new ArrayList<>();
//        employeeRepository.findByEmployeeId(employeeId).forEach(employeeList::add);
//        return employeeList;
//    }

    @Override
    public List<Employee> getALlEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;
    }


}

