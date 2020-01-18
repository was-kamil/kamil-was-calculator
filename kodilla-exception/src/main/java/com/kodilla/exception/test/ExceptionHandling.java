package com.kodilla.exception.test;


public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
                System.out.println("\n" + "Exception handling started!" + "\n");

        try {
            String result = secondChallenge.probablyIWillThrowException(2, 1);
                System.out.println(result);

        } catch (Exception e) {
                System.out.println("Thrown exception named: " + e + "\n");

        } finally {
                System.out.println("End of program");
        }
    }
}
