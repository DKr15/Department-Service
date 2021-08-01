package com.example.department.service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public Department createDepartment(Department department) {
       return departmentRepo.save(department);
    }

    public Department findDepartmentById(Long depId) {
        return  departmentRepo.findByDepId(depId);
    }

    public List<Department> findAllDepartment() {
        return departmentRepo.findAll();
    }
}
