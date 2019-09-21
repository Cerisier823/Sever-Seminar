package com.ec.springagain.Controllers;

import com.ec.springagain.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CaculatorContoller {

    @Autowired //아래 서비스를 자동으로 가져오겠다!
    private CalculatorService calculatorService;

    @RequestMapping("/add")
    public int add(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return calculatorService.add(num1, num2);
    }

    @RequestMapping("/subtract")
    public int subtract(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return calculatorService.subtract(num1, num2);
    }

    @RequestMapping("/multiple")
    public int multiple(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return calculatorService.multiple(num1, num2);
    }

    @RequestMapping("/division")
    public int division(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return calculatorService.division(num1, num2);
    }
}
