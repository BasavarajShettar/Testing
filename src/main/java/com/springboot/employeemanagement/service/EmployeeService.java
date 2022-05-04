package com.springboot.employeemanagement.service;

import java.util.List;

import com.springboot.employeemanagement.Entity.Employee;

public interface EmployeeService 
{
    public List<Employee> findAll();
    
    public Employee findById(String employeeId);
    
    public void save(Employee theEmployee);
    
    public void deleteById(int theId);

	Employee findById(int theId);
    
}