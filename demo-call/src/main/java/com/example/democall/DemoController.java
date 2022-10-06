package com.example.democall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private ServicePuiApi servicePuiApi;

    @GetMapping("/call")
    public String call() {
        return servicePuiApi.callServicePui("success");
    }
}

@FeignClient(name = "service-pui",  url = "http://localhost:8080")
interface ServicePuiApi {
    @GetMapping("/count/{message}")
    public String callServicePui(@PathVariable String message);
}

