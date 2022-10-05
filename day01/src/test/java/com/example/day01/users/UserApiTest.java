package com.example.day01.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserApiTest {

    @Autowired
    private UserApi userApi;

    @Test
    public void getData() {
        UserResponse result = userApi.getData(1);
        assertEquals("Sincere@april.biz", result.getEmail());
    }
}