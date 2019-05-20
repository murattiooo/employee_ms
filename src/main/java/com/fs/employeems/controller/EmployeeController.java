package com.fs.employeems.controller;

import com.fs.employeems.dao.Department;
import com.fs.employeems.dao.Employee;
import com.fs.employeems.dao.Position;
import com.fs.employeems.service.DepartmentService;
import com.fs.employeems.service.EmployeeService;
import com.fs.employeems.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "${ms.url}", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/add-employee")
    public Employee addEmployee(@RequestBody final Employee employee) {
        return employeeService.addEmployee(employee);
    }


    @GetMapping("/get-employees")
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(employeeService.getALlEmployee());
        return employeeList;
    }
}
