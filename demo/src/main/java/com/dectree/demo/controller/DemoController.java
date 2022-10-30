package com.dectree.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 10/30/2022, Sunday
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test")
    public String testGet() {
        return "Hello DecTree!";
    }
}

