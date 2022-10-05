package com.example.day01;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public String employeeNotFoundException(RuntimeException e) {
        return e.getMessage();
    }

}
