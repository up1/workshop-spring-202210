package com.example.day01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * GET /employee/1
 *
 * response
 * {
 * 	"id": 1,
 * 	"name": "somkiat
 * }
 *
 *
 */
@RestController
public class EmployeeController {

    @GetMapping("/employee/{id}")
    public EmployeeResponse getById(@PathVariable int id) {
        return new EmployeeResponse();
    }

}
