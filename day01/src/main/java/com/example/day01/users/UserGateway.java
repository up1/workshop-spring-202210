package com.example.day01.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public Optional<UserResponse> getUserById(int id) {
        String url = "https://jsonplaceholder.typicode.com/users/" + id;
        try {
            UserResponse response
                    = restTemplate.getForObject(url, UserResponse.class);
            return Optional.of(response);
        } catch (RestClientException e) {
            return Optional.empty();
        }
    }

}
