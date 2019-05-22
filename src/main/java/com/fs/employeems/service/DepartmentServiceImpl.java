package com.fs.employeems.service;

import com.fs.employeems.dao.Department;
import com.fs.employeems.dao.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department addDepartment(Department department) {

        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();

    }

    @Override
    public void deleteDepartment(Long id) {

        departmentRepository.deleteById(id);
    }

    @Override
    public List<Department> findByName(String name) {
        return departmentRepository.findByName(name);
    }

    @Override
    public Department updateDep(Department dep) {
        return departmentRepository.save(dep);
    }


}
