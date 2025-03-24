package com.example.calculator.model;

public class CalculationResult {
    private String expression;
    private String result;

    public CalculationResult(String expression, String result) {
        this.expression = expression;
        this.result = result;
    }

    public String getExpression() {
        return this.expression;
    }

    public String getResult() {
        return this.result;
    }
}