package com.pranaydawne007.discovery_client_2.service;

import com.pranaydawne007.discovery_client_2.model.Employee;
import com.pranaydawne007.discovery_client_2.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements EmployeeRepository {

    List<Employee> employees = new ArrayList<>();
    @Override
    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public Employee findById(Long id) {
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElseThrow();
    }

    @Override
    public List<Employee> findByDeptId(Long departmentId) {
        return employees.stream().filter(employee -> employee.getDepartmentId().equals(departmentId)).toList();
    }
}
