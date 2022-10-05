package com.example.day01.users;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service",
        url = "https://jsonplaceholder.typicode.com")
public interface UserApi{

    @GetMapping("/users/{id}")
    UserResponse getData(@PathVariable int id);

}
