package com.example.day01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    public void found_getEmployeeById() {
         // Arrange
        Employee e5 = new Employee();
        e5.setId(5);
        e5.setName("Somkiat");
        repository.save(e5);
         // Act
         Optional<Employee> result = repository.findById(5);
         assertTrue(result.isPresent());
    }

    @Test
    public void notfound_getEmployeeById5() {
        // Act
        Optional<Employee> result = repository.findById(5);
        assertFalse(result.isPresent());
    }


}