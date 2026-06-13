package com.kishdizon;

public class Calculator {
    private String name;
    private Logger logger;

    public Calculator(String name, Logger logger) {
        this.name = name;
        this.logger = logger;
    }

    public int add(int a, int b) {
        logger.log("Adding " + a + " + " + b);
        return a + b;
    }

    public int subtract(int a, int b){
        logger.log("Subtracting " + a + " - " + b);
        return a - b;
    }

    public int multiply(int a, int b){
        logger.log("Multiply " + a + " * " + b);
        return a * b;
    }

    public int divide(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return a / b;
    }

    public String getName() {
        return this.name;
    }
}
