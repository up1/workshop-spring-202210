package com.example.day01.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserGatewayTest {

    @Autowired
    private UserGateway userGateway;

    @Test
    void getUserById() {
         Optional<UserResponse> result
                 = userGateway.getUserById(1);
         assertTrue(result.isPresent());
         assertEquals("Sincere@april.biz", result.get().getEmail());
    }
}