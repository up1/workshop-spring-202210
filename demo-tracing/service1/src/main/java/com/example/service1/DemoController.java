package com.example.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private Service2Api service2Api;

    @GetMapping("service1/call")
    public String doSth() {
        return service2Api.callService2();
    }

}

@FeignClient(name = "service-2", url = "http://localhost:8082")
interface Service2Api {

    @GetMapping("/service2/call")
    String callService2();

}
