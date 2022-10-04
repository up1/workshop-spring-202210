package com.example.day01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment= RANDOM_PORT)
class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate template;

    @MockBean
    private EmployeeService stubService;

    @Test
    public void getById() {
        EmployeeResponse expected = new EmployeeResponse();
        expected.setId(5);
        expected.setName("Somkiat");
        // Stub
        when(stubService.getData(5))
                .thenReturn(expected);

        // Act :: Call target service
        EmployeeResponse response =
                template.getForObject(
                        "/employee/5", EmployeeResponse.class);
        assertEquals(5, response.getId());
        assertEquals("Somkiat", response.getName());
        assertEquals(expected, response);
    }
}