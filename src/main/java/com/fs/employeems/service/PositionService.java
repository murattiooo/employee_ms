package com.fs.employeems.service;



import com.fs.employeems.dao.Position;

import java.util.List;

public interface PositionService {
    Position addPosition(Position position );
    List<Position> getAllPosition();
    void deletePosition (Long id);
    List<Position> findByName(String name);
    Position updatePosition(Position position);

}
