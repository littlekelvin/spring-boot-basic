package com.example.demo.controller;

import com.example.demo.util.FibnacciCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/fibnacci")
public class FibnacciController {
    
    @RequestMapping(value = "{num}")
    @ResponseBody
    public String getGibnacciNumber(@PathVariable(name = "num") Integer num) {
        return String.valueOf(FibnacciCounter.getFibnacci(num));
    }
}
