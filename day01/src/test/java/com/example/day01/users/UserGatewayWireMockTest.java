package com.example.day01.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureWireMock(port = 9999)
class UserGatewayWireMockTest {

    @Autowired
    private UserGateway userGateway;

    @Test
    public void success_case() {
        Optional<UserResponse> result
                = userGateway.getUserById(1);
        assertTrue(result.isPresent());
        assertEquals("Sincere@april.biz", result.get().getEmail());
    }

}