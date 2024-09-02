package com.pranaydawne007.discovery_client_1.service;

import com.pranaydawne007.discovery_client_1.model.Department;
import com.pranaydawne007.discovery_client_1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService implements DepartmentRepository{


    List<Department> departments = new ArrayList<>();


    @Override
    public Department addDepartment(Department department) {
        departments.add(department);
        return department;
    }

    @Override
    public List<Department> findAll() {
        return departments;
    }

    @Override
    public Department findById(Long id) {
        return departments.stream().filter(department -> department.getId().equals(id)).findFirst().orElseThrow();
    }
}
