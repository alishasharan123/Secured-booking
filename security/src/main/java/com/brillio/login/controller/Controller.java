package com.brillio.login.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
public class Controller {

    @GetMapping("/")
    public String display(){
        return "Hello World";
    }

    @GetMapping("/success")
    public String success(){
        return "logged in successfully";
    }

    @GetMapping("/fail")
    public String fail(){
        return "Login Failed";
    }

}

