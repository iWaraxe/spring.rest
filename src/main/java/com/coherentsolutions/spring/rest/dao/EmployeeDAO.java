package com.coherentsolutions.spring.rest.dao;

import com.coherentsolutions.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(int id);

    void deleteEmployee(int id);
}