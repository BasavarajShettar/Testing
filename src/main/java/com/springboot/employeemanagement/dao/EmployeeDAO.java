package com.springboot.employeemanagement.dao;
import java.util.List;

import com.springboot.employeemanagement.Entity.Employee;

public interface EmployeeDAO 
{
    public List<Employee> findAll();
    
    public Employee findById(int theId);
    
    public void save(Employee theEmployee);
    
    public void deleteById(int theId);
}