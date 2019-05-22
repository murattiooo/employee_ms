package com.fs.employeems.service;

import com.fs.employeems.dao.Position;
import com.fs.employeems.dao.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public Position addPosition(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public List<Position> getAllPosition(){
        return positionRepository.findAll();
    }
    @Override
    public void  deletePosition(Long id){
        positionRepository.deleteById(id);
    }
    @Override
    public List<Position>findByName(String name)
    {
       return positionRepository.findByName(name);
    }

    @Override
    public Position updatePosition(Position position){
        return  positionRepository.save(position);
    }

}
