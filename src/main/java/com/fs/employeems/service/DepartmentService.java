package com.fs.employeems.service;


import com.fs.employeems.dao.Department;

import java.util.List;


public interface DepartmentService {
    Department addDepartment(Department department);
    List<Department> getAllDepartment();
    void deleteDepartment(Long id);
    List<Department>findByName(String name);
   Department updateDep(Department department );

}
