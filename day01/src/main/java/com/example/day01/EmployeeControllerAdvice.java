package com.example.day01;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String>
            employeeNotFoundException(RuntimeException e) {
        return
                new ResponseEntity<>(e.getMessage(),
                        HttpStatus.NOT_FOUND);
    }

}
