package com.demo.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Value("${test.msg}")
    private String testMsg;

    @GetMapping("/dc")
    public String dc() {
        System.out.println(testMsg);
        return testMsg;
    }

}