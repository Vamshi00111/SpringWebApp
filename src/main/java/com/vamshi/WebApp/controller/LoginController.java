package com.vamshi.WebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "You are logged in";
    }
}
