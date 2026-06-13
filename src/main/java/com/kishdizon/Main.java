package com.kishdizon;

public class Main{
    public static void main(String[] args) {
        Logger logger = new Logger();
        Calculator calc = new Calculator("Casio", logger);
        System.out.println(calc.add(9, 10));
        System.out.println(calc.subtract(10,9));
        System.out.println(calc.multiply(7, 7));
        System.out.println(calc.divide(10, 2));

        try {
            System.out.println(calc.divide(9, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(calc.getName());
    }


}