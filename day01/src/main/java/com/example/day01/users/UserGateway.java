package com.example.day01.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

}
