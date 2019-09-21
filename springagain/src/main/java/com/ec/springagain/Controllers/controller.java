package com.ec.springagain.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {

    @RequestMapping("")
    public String Hello(){
        return "Hello, World!";
    }
}
