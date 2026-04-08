package com.faizan.employee_directory_api.controller;

import com.faizan.employee_directory_api.entity.Employee;
import com.faizan.employee_directory_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getByEmpId(@PathVariable int id){
        return service.getByEmpId(id);
    }

    @PostMapping
    public void updateEmp(@RequestBody Employee employee){
        service.updateEmp(employee);
    }


    @DeleteMapping("/{id}")
    public void deleteEmp(@PathVariable int id){
        service.deleteEmp(id);
    }
}
