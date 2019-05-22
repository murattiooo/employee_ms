package com.fs.employeems.controller;

import com.fs.employeems.dao.Position;
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
public class PositionController {

    @Autowired
    private PositionService positionService;


    @PostMapping("/add-pos")
    public Position addPosition(@RequestBody final Position position) {
        return positionService.addPosition(position);

    }
    @GetMapping("/get-pos")
    public List<Position> getAllPosition() {
        List<Position> positionList = new ArrayList<>();
        positionList.addAll(positionService.getAllPosition());
        return positionList;
    }
    @GetMapping("/delete-pos/{id}")
    public void deletePosition(@PathVariable  Long id){
        positionService.deletePosition(id);
    }

    @GetMapping("/findPosByName/{name}")
    public List<Position> findByName(@PathVariable String name){

        return positionService.findByName(name);
    }
    @PutMapping("/update-pos")
    public ResponseEntity<Position> updatePosition(@RequestBody  Position position){
        positionService.updatePosition(position);
        return new ResponseEntity<Position>(position, HttpStatus.OK);
    }
}
