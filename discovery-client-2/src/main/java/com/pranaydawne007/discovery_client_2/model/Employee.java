package com.pranaydawne007.discovery_client_2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;
    private Long departmentId;
    private String name;
    private int age;
    private String position;
}
