package com.example.day01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment= RANDOM_PORT)
class EmployeeController2Test {

    @Autowired
    private TestRestTemplate template;

    @Autowired
    private EmployeeRepository repository;

    @Test
    public void getById() {
        // Arrange
        Employee e5 = new Employee();
        e5.setId(5);
        e5.setName("Somkiat");
        repository.save(e5);

        EmployeeResponse expected = new EmployeeResponse();
        expected.setId(5);
        expected.setName("Somkiat");

        // Act :: Call target service
        EmployeeResponse response =
                template.getForObject(
                        "/employee/5", EmployeeResponse.class);
        assertEquals(5, response.getId());
        assertEquals("Somkiat", response.getName());
        assertEquals(expected, response);
    }
}