package com.fs.employeems.service;

import com.fs.employeems.dao.Position;
import com.fs.employeems.dao.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public void addPosition(Position position) {
        positionRepository.save(position);

    }
}
