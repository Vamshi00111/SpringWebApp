package com.vamshi.WebApp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //To transfer only the data(State) - RestData Representatinal State Transfer
@RequestMapping("/api")
public class HomeController {
    @RequestMapping("/") // This is for the method - to direct the method to given path
    public String greet(){
        return "Welcome to my Page";
    }
    @RequestMapping("/about")
    public String About(){
        return "Welcome to my ABout Page";
    }
}
