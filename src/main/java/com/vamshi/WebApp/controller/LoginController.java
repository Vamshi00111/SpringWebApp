package com.vamshi.WebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "You are logged in";
    }
}
