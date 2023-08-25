package com.adong.blogservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping ("/add") // GET / add    /add?num1=10&num2=20
    public int addTwoNumber(@RequestParam int num1, @RequestParam int num2)
    {
        return num1 + num2;
    }
}
