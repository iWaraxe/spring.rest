package com.coherentsolutions.spring.rest.controller;

import com.coherentsolutions.spring.rest.entity.Employee;
import com.coherentsolutions.spring.rest.exceptions.EmployeeIncorrectData;
import com.coherentsolutions.spring.rest.exceptions.NuSuchEmployeeException;
import com.coherentsolutions.spring.rest.service.EmployeeService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Integer id) throws NotFoundException {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee == null) {
            throw new NotFoundException("Employee with id " + id + " not found in the database");
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Integer id) throws NotFoundException {
        Employee employee = employeeService.getEmployeeById(id);
        if(employee == null) {
            throw new NotFoundException("Employee with id " + id + " not found in the database");
        }
        employeeService.deleteEmployee(id);
        return "Employee with ID = " + id + " was deleted successfully";
    }
}
