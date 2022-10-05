package com.example.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

    @GetMapping("/service2/call")
    public String call2() {
        return "Result from service 2";
    }

}
