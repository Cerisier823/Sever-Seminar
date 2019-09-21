package com.ec.springagain.Controllers;

import com.ec.springagain.services.StrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/string")
public class StrController {

    @Autowired
    private StrService strService;

    @RequestMapping("/append")
    public String append(@RequestParam("str1") String str1,@RequestParam("str2") String str2){
        return strService.append(str1, str2);
    }

    @RequestMapping("/equals")
    public boolean equals(@RequestParam("str1") String str1, @RequestParam("str2")String str2){
        return strService.equals(str1, str2);
    }

    @RequestMapping("/length")
    public int length(@RequestParam("str") String str){
        return strService.length(str);
    }

    @RequestMapping("/charAt")
    public char charAt(@RequestParam("str") String str, @RequestParam("index") int index){
        return strService.charAt(str, index);
    }
}
