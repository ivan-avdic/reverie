package com.sailingpappi.reverie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// FOR TESTING PURPOSES - WILL BE REMOVED!
@RestController
@RequestMapping("/test")
public class RestTestController {

    @GetMapping("/hello")
    public String hello() {
        return "I WORK!";
    }
}
