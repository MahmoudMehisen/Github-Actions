package com.mehisen.githubactions;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/api/welcome")
    public String welcome() {
        return welcomeMessage;
    }

    @GetMapping("/api/hello-again")
    public String helloAgain() {
        return "Hello World!";
    }

    @GetMapping("/api/welcome2")
    public String welcome2() {
        return welcomeMessage + 2;
    }

    @GetMapping("/api/welcome3")
    public String welcome3() {
        return welcomeMessage + 3;
    }
}