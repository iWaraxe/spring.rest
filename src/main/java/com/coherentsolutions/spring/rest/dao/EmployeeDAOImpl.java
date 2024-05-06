package com.coherentsolutions.spring.rest.dao;

import com.coherentsolutions.spring.rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> employees = query.getResultList();
        return employees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("delete from Employee where id = :employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }

}
