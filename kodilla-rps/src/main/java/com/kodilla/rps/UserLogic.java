package com.kodilla.rps;

import java.util.Scanner;
import static com.kodilla.rps.MainLogic.*;


public class UserLogic {

    public static String getUserName() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome! Let's play ROCK-PAPER-SCISSORS game!\n");
        System.out.println("Enter your name: ");

        return scanner.nextLine();
    }

    public static int getWinPoints() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose how many points to win the game (1-10): ");
        boolean numberOfPointsToWin = true;
        int input = 1;

        while (numberOfPointsToWin) {
                input = scanner.nextInt();
            if (input <=10) {
                numberOfPointsToWin = false;
            } else {
                System.out.println("Unacceptable value. Allowed between 1-10. Try again.");
            }
         }
        return input;
    }

    public static MainLogic getMainSelection() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nChoose your move:");
        System.out.println("1.ROCK   2.PAPER   3.SCISSORS");
        System.out.println("X.END GAME   N.NEW GAME");
        String selection;

        while (true) {
            selection = scanner.nextLine().toUpperCase();
            switch (selection){
                case "1":   return ROCK;
                case "2":   return PAPER;
                case "3":   return SCISSORS;
                case "X":   return END_GAME;
                case "N":   return NEW_GAME;
                default:    System.out.println(selection + " is unacceptable value. Try again.");
                    break;
            }
        }
    }

    public static MainLogic getRestartAfterEnd() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Play again?");
        System.out.println("1. YES   2. NO");
        String selection;

        while(true){
            selection = scanner.nextLine();
            switch (selection){
                case "1":   return NEW_GAME;
                case "2":   return END_GAME;
                default:    System.out.println(selection + " is unacceptable value. Try again.");
                    break;
            }
        }
    }
}