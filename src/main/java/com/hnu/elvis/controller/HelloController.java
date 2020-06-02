package com.hnu.elvis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Elvis on 2020/6/1.
 */
@RestController
@RequestMapping(value = "/")
public class HelloController {
    @RequestMapping("hello")
    public String login(){
        return "hello world!!";
    }
}
