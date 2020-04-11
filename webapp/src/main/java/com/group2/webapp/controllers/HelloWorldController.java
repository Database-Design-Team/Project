package com.group2.webapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/helloworld")
    @ResponseBody
    public String helloworld(@RequestParam(defaultValue = "Ivan") String name) {
        return "Hello " + name;
    }

    @GetMapping("/welcome")
    @ResponseBody
    public String welcome() {
        return welcomeMessage;
    }
}
