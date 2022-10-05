package com.example.day01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository stub;

    @DisplayName("Found employee info with id = 1")
    @Test
    public void case01() {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Demo user");
        when(stub.findById(1)).thenReturn(Optional.of(e1));

        EmployeeService service = new EmployeeService(stub);
        EmployeeResponse result = service.getData(1);
        assertEquals(1, result.getId());
        assertEquals("Demo user", result.getName());
    }

    @DisplayName("Employee Not Found with id = 2")
    @Test
    public void case02() {
        when(stub.findById(2)).thenReturn(Optional.empty());

        EmployeeService service = new EmployeeService(stub);
        try {
            service.getData(2);
            fail();
        } catch (Exception e) {
            if(!"Employee not found with id=2"
                    .equals(e.getMessage())) {
                fail();
            }
        }
    }

    @DisplayName("Employee Not Found with id = 3")
    @Test
    public void case03() {
        when(stub.findById(3)).thenReturn(Optional.empty());

        EmployeeService service = new EmployeeService(stub);
        Exception e = assertThrows(RuntimeException.class, () ->
                service.getData(3));
        assertEquals("Employee not found with id=3", e.getMessage());
    }
}