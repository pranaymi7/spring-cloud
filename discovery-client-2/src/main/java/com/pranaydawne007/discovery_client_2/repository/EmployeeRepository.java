package com.pranaydawne007.discovery_client_2.repository;

import com.pranaydawne007.discovery_client_2.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository {

    public Employee addEmployee(Employee employee);

    public List<Employee> findAll();

    public Employee findById(Long id);

    public List<Employee> findByDeptId(Long departmentId);
}
