package com.example.day01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment= RANDOM_PORT)
class EmployeeFailureControllerTest {

    @Autowired
    private TestRestTemplate template;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void case_handle_exception() {
        when(employeeService.getData(10))
                .thenThrow(new RuntimeException("Error"));

        ResponseEntity<String> response =
                template.getForEntity(
                        "/employee/10", String.class);
        assertEquals(404, response.getStatusCode().value());
        assertEquals("Error", response.getBody());
    }
}