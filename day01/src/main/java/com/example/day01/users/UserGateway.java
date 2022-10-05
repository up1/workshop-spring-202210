package com.example.day01.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
public class UserGateway {

    private final String url;

    @Autowired
    private RestTemplate restTemplate;

    public UserGateway(@Value("${url}") String url) {
        this.url = url;
    }

    public Optional<UserResponse> getUserById(int id) {
        String url =  this.url + "/users/" + id;
        try {
            UserResponse response
                    = restTemplate.getForObject(url, UserResponse.class);
            return Optional.of(response);
        } catch (RestClientException e) {
            return Optional.empty();
        }
    }

}
