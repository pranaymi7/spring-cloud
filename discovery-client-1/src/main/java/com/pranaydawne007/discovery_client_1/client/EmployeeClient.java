package com.pranaydawne007.discovery_client_1.client;

import com.pranaydawne007.discovery_client_1.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("/department/{departmentId}")
    public List<Employee> findByDepartmentId(@PathVariable Long departmentId);
}
