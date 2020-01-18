package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 6);
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Divide by the -zero- number isn't permitted!!");

        } finally {

            System.out.println("End of program");
        }
    }
}