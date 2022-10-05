package com.example.day01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public EmployeeResponse getData(int id) {
        Optional<Employee> result = repository.findById(id);
        if(result.isPresent()) {
            Employee employee = result.get();
            EmployeeResponse response = new EmployeeResponse();
            response.setId(employee.getId());
            response.setName(employee.getName());
            return response;
        }
        throw new RuntimeException("Employee not found with id="+ id);
    }
}
