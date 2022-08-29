package com.example.restapiapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value={"/home","/",""},method = RequestMethod.GET)
public class RestApiControl {
    @GetMapping("/any")
    public String getUsers(@RequestParam(value = "name", defaultValue = "Nishant") String name)
    {
        return "Hello! " + name + " welcome to BridgeLabz!!";
    }
    @RequestMapping(value = {"/any/{age}"},method = RequestMethod.GET)
    public String getAge(@PathVariable String age){
        return "<h1>You are "+age+" years old.</h1>";
    }
}
