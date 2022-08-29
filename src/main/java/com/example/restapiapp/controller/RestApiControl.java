package com.example.restapiapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiControl {
    @RequestMapping("/home")
    public String index(){
        return "<h2>Hello, this is Nishant from BridgeLabz!</h2>";
    }
}
