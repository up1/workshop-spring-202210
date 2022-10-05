package com.example.demolog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {

    private static final Logger log = LoggerFactory.getLogger("logstash");

    @GetMapping("/call2")
    public String call2() {
        log.info("Call call2() method");
        return "Call 2";
    }

}
