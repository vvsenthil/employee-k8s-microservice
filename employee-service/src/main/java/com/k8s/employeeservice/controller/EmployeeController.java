package com.k8s.employeeservice.controller;

import com.k8s.employeeservice.entity.Employee;
import com.k8s.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        System.out.println("*******Inside EmployeeController saveEmployee***********");
        return service.saveEmployee(employee);
    }

    @GetMapping("/allEmployees")
    public List<Employee> getAllEmployees(){
        System.out.println("*******Inside EmployeeController getAllEmployees***********");
        return service.getAllEmployees();
    }

    @GetMapping("/{empId}")
    public Employee getEmployeeById(@PathVariable("empId") String empId){
        System.out.println("*******Inside EmployeeController getEmployeeById***********");
        return service.findEmployeeByID(empId);
    }
}
