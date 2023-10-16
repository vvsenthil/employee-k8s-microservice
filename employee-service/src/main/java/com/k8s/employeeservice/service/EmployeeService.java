package com.k8s.employeeservice.service;

import com.k8s.employeeservice.entity.Employee;
import com.k8s.employeeservice.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee emp){
        System.out.println("*********inside EmployeeService saveEmployee()****");
        return repository.save(emp);
    }

    public List<Employee> getAllEmployees(){
        System.out.println("*********inside EmployeeService getAllEmployees()****");
        return repository.findAll();
    }

    public Employee findEmployeeByID(String empId){
        System.out.println("*********inside EmployeeService findEmployeeByID()****"+empId);
        return repository.findByEmpId(empId);
    }
}
