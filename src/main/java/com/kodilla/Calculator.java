package com.kodilla;

public class Calculator {

    double a;
    double b;

    public double sumMetod(double a, double b)
    {
    return a + b;
    }

    public double subMetod(double a, double b)
    {
        return a - b;
    }

    public static void main (String[] args)
    {
        Calculator calculator = new Calculator();
        calculator.sumMetod(5, 10);
        calculator.sumMetod(10, 5);

        System.out.println(calculator.sumMetod(5, 10));
        System.out.println(calculator.subMetod(5, 10));
    }
}
