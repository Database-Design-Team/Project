package com.group2.springandreact;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.Controller;

@Controller
public class LoginController {
    @RequestMapping(value = {"/",  "/profile"})
    public String index() {
        return "/index.html";
    }
}