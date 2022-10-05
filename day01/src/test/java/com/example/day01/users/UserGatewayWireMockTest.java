package com.example.day01.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.http.MediaType;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;


@SpringBootTest
@AutoConfigureWireMock(port = 9999)
class UserGatewayWireMockTest {

    @Autowired
    private UserGateway userGateway;

    @Test
    public void success_case() throws IOException {
        stubFor(get(urlPathEqualTo("/users/1"))
        .willReturn(aResponse()
                .withBody(read("classpath:userApiResponse.json"))
                .withHeader(CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .withStatus(200)));


        Optional<UserResponse> result
                = userGateway.getUserById(1);
        assertTrue(result.isPresent());
        assertEquals("somkiat@xxx.com", result.get().getEmail());
    }

    public static String read(String filePath) throws IOException {
        File file = ResourceUtils.getFile(filePath);
        return new String(Files.readAllBytes(file.toPath()));
    }

}