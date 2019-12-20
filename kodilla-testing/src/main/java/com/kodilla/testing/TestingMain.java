package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("Simple user test OK");
        } else {
            System.out.println("Error!");
        }



// Testing Calculator class

        Calculator calcula = new Calculator ();

        int addResult = calcula.addAToB(100, 50);
        int subtractResult = calcula.subAFromB(100, 50);

        if (addResult == 150 && subtractResult == 50) {
            System.out.println("Calculator test passed.");
        } else {
            System.out.println("Calculator test failed.");
        }

    }
}