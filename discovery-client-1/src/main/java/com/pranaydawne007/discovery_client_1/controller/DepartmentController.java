package com.pranaydawne007.discovery_client_1.controller;

import com.pranaydawne007.discovery_client_1.client.EmployeeClient;
import com.pranaydawne007.discovery_client_1.model.Department;
import com.pranaydawne007.discovery_client_1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeClient employeeClient;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department){
        return departmentRepository.addDepartment(department);
    }

    @GetMapping
    public List<Department> findAllDepartments(){
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Department findDeptById(@PathVariable Long id){
        return departmentRepository.findById(id);
    }

    @GetMapping("/with-employees")
    public List<Department> findAllDepartmentsWithEmployees(){
        List<Department> departments = departmentRepository.findAll();

        departments.forEach(department ->
            department.setEmployeeList(employeeClient.findByDepartmentId(department.getId())));

        return departments;
    }


}
