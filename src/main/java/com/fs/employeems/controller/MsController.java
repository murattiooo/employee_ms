package com.fs.employeems.controller;

import com.fs.employeems.dao.Position;
import com.fs.employeems.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${ms.url}")
public class MsController {

    @Autowired
    private PositionService positionService;


    @PostMapping("/add-position")
    public void addPosition(@RequestBody final Position position) {
        positionService.addPosition(position);
    }
}
