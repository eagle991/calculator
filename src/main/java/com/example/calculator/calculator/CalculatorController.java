package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/calculator"})
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping({"/plus"})
    public String add(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        this.validateParams(num1, num2);
        return this.calculatorService.add(num1, num2);
    }

    @GetMapping({"/minus"})
    public String subtract(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        this.validateParams(num1, num2);
        return this.calculatorService.subtract(num1, num2);
    }

    @GetMapping({"/multiply"})
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        this.validateParams(num1, num2);
        return this.calculatorService.multiply(num1, num2);
    }

    @GetMapping({"/divide"})
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        this.validateParams(num1, num2);
        return this.calculatorService.divide(num1, num2);
    }

    private void validateParams(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Both parameters must be provided.");
        }
    }
}
