package com.example.department.controller;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/")
    public Department createDepartment(@RequestBody Department department){
        return departmentService.createDepartment(department);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long depId ){
        return departmentService.findDepartmentById(depId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public List<Department> findAllDepartment(){
        return departmentService.findAllDepartment();
    }

}
