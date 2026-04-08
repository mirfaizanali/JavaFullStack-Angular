package com.faizan.employee_directory_api.service;

import com.faizan.employee_directory_api.entity.Employee;
import com.faizan.employee_directory_api.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Optional<Employee> getByEmpId(int id) {
        return repo.findById(id);
    }

    public void updateEmp(Employee employee) {
        repo.save(employee);
    }

    public void deleteEmp(int id) {
        repo.deleteById(id);
    }



}
