package com.pranaydawne007.discovery_client_1.repository;

import com.pranaydawne007.discovery_client_1.model.Department;
import com.pranaydawne007.discovery_client_1.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface DepartmentRepository {

    public Department addDepartment(Department department);

    public List<Department> findAll();

    public Department findById(Long id);
}
