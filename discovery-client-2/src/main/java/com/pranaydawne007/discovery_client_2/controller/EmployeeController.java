package com.pranaydawne007.discovery_client_2.controller;

import com.pranaydawne007.discovery_client_2.model.Employee;
import com.pranaydawne007.discovery_client_2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepository.addEmployee(employee);
    }
    @GetMapping
    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }
    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable Long id){
        return employeeRepository.findById(id);
    }
    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartmentId(@PathVariable Long departmentId){
        return employeeRepository.findByDeptId(departmentId);
    }
}
