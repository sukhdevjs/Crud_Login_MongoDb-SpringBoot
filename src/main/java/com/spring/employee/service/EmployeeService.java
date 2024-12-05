package com.spring.employee.service;

import com.spring.employee.model.Employee;
import com.spring.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(Long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(null);
    }
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee updateEmployee(Long id, Employee employeeDetails){
        Employee employee = getEmployeeById(id);
        if (employee != null){
            employee.setFirstName(employeeDetails.getFirstName());
            employee.setLastName(employeeDetails.getLastName());
            employee.setEmail(employeeDetails.getEmail());
            employee.setDepartment(employeeDetails.getDepartment());
        }
        return null;
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}
