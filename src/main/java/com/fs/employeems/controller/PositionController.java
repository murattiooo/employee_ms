package com.fs.employeems.controller;

import com.fs.employeems.dao.Department;
import com.fs.employeems.dao.Employee;
import com.fs.employeems.dao.Position;
import com.fs.employeems.service.DepartmentService;
import com.fs.employeems.service.EmployeeService;
import com.fs.employeems.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "${ms.url}", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class PositionController {

    @Autowired
    private PositionService positionService;


    @PostMapping("/add-position")
    public Position addPosition(@RequestBody final Position position) {
        return positionService.addPosition(position);

    }


}
