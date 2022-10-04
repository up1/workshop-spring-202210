package com.example.day01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EmployeeController.class)
class EmployeeMvcControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private EmployeeService stubService;

    @Test
    public void case01() throws Exception {
        this.mvc.perform(get("/employee/5")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}