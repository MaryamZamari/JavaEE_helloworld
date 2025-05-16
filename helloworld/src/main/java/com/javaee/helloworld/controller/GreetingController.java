package com.javaee.helloworld.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.logging.Logger;
@RequestMapping("/api/v1")
public class GreetingController {

    @GetMapping("/greet")
    @ResponseBody
    public String greet(@RequestParam String name){

        if(name != null){
            ResponseEntity.status(200);
            return "hello " + name;
        }
        return "no name was passed!";
    }


}
