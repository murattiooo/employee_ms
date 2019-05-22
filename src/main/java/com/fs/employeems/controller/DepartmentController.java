package com.fs.employeems.controller;

import com.fs.employeems.dao.Department;
import com.fs.employeems.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "${ms.url}", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/department")
    public Department addDepartment(@RequestBody final Department department) {
        return departmentService.addDepartment(department);
    }

    @GetMapping("/get-dep")
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @DeleteMapping("/delete-dep/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }

    @GetMapping("/findDepByName/{name}")
    public List<Department> findByNameAndSurname(@PathVariable String name) {
        return departmentService.findByName(name);
    }

    @PutMapping("update-dep")
    public ResponseEntity<Department> updateDepartment(@RequestBody Department department) {
        departmentService.updateDep(department);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

}
