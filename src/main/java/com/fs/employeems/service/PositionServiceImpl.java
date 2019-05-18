package com.fs.employeems.service;

import com.fs.employeems.dao.Position;
import com.fs.employeems.dao.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public Position addPosition(Position position) {
        return positionRepository.save(position);

    }
}
