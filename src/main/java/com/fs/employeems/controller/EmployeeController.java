package com.fs.employeems.controller;

import com.fs.employeems.dao.Employee;
import com.fs.employeems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "${ms.url}", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/add-emp")
    public Employee addEmployee(@RequestBody final Employee employee) {
        return employeeService.addEmployee(employee);
    }


    @GetMapping("/get-emp")
    public List<Employee> getAllEmployee() {
        return employeeService.getALlEmployee();
    }


    @DeleteMapping("/delete-emp/{id}")
    public void deleteEmployee(@PathVariable Long id){
         employeeService.deleteEmployee(id);

    }
    @GetMapping("/findEmpByNameAndSurname/{name}/{surname}")
    public List<Employee> findByNameAndSurname(@PathVariable String name, @PathVariable String surname) {
        return employeeService.findByNameAndSurname(name,surname);
    }

    @PutMapping("/update-emp")
    public ResponseEntity<Employee> updatePosition(@RequestBody  Employee employee){
        employeeService.updateEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
