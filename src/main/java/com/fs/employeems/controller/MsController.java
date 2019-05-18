package com.fs.employeems.controller;

import com.fs.employeems.dao.Department;
import com.fs.employeems.dao.Position;
import com.fs.employeems.service.DepartmentService;
import com.fs.employeems.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "${ms.url}", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class MsController {

    @Autowired
    private PositionService positionService;

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/add-position")
    public Position addPosition(@RequestBody final Position position) {
        return positionService.addPosition(position);

    }

    @PostMapping("/add-department")
    public Department addDepartment(@RequestBody final Department department) {
        return departmentService.addDepartment(department);

    }
}
