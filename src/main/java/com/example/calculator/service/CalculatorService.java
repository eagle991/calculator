package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public CalculatorService() {
    }

    public String add(int num1, int num2) {
        return this.formatResult(num1, num2, "+", num1 + num2);
    }

    public String subtract(int num1, int num2) {
        return this.formatResult(num1, num2, "-", num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return this.formatResult(num1, num2, "*", num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        } else {
            return this.formatResult(num1, num2, "/", num1 / num2);
        }
    }

    private String formatResult(int num1, int num2, String operation, int result) {
        return "" + num1 + " " + operation + " " + num2 + " = " + result;
    }
}