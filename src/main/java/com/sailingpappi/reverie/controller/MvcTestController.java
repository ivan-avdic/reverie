package com.sailingpappi.reverie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// FOR TESTING PURPOSES - WILL BE REMOVED!
@Controller
@RequestMapping("/mvc")
public class MvcTestController {

    @GetMapping("/hello")
    public String hello(Model m) {
        m.addAttribute("theDate", new java.util.Date());
        return "helloworld";
    }
}
