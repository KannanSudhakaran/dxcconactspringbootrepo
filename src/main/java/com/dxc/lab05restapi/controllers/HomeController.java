package com.dxc.lab05restapi.controllers;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api/v1/home")
public class HomeController {

    @GetMapping
    public String get(){
        return "Get called on server :"+formattedTime();
    }

    @PostMapping
    public String post(){
        return "Post called on server :"+formattedTime();
    }

    @PutMapping
    public String put(){
        return "PUT called on server :"+formattedTime();
    }

    @DeleteMapping
    public String delete(){
        return "Delete called on server :"+formattedTime();
    }




    private  String formattedTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }
}
