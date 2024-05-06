package com.coherentsolutions.spring.rest.service;

import com.coherentsolutions.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(int id);

    void deleteEmployee(int id);

}
