package com.kodilla.rps;

import java.util.Random;
import static com.kodilla.rps.MainLogic.*;


public class GameLogic {

    private Object userName;
    private MainLogic userSelect;
    private int userPoints;
    private int computerPoints;

    public GameLogic() {
        this.userPoints = 0;
        this.computerPoints = 0;
    }

    private boolean userWinMethod(MainLogic userSelect, MainLogic computerSelect) {
        if(userSelect == ROCK && computerSelect == SCISSORS){
            return true;
        } else if(userSelect == ROCK && (computerSelect == ROCK || computerSelect == PAPER)){
            return false;
        } else if(userSelect == PAPER && computerSelect == ROCK){
            return true;
        } else if(userSelect == PAPER && (computerSelect == PAPER || computerSelect == SCISSORS)){
            return false;
        } else return userSelect == SCISSORS && computerSelect == PAPER;
    }

    private boolean computerWinMethod(MainLogic userSelect, MainLogic computerSelect) {
        if(computerSelect == ROCK && userSelect == SCISSORS){
            return true;
        } else if(computerSelect == ROCK && (userSelect == ROCK || userSelect == PAPER)){
            return false;
        } else if(computerSelect == PAPER && userSelect == ROCK){
            return true;
        } else if(computerSelect == PAPER && (userSelect == PAPER || userSelect == SCISSORS)){
            return false;
        } else return computerSelect == SCISSORS && userSelect == PAPER;
    }

    private MainLogic computerRandomMethod() {

        Random random = new Random();
        int randomInt = random.nextInt(3);

        if(randomInt == 0){
            return ROCK;
        } else if(randomInt == 1){
            return PAPER;
        } else {
            return SCISSORS;
        }
    }

    public void launchMethod(){

        userName = UserLogic.getUserName();
        int numberOfPointsToWin = UserLogic.getWinPoints();

        System.out.println(userName + ", you will play to " + numberOfPointsToWin + " points.");
        while(userPoints < numberOfPointsToWin && computerPoints < numberOfPointsToWin){
            userSelect = UserLogic.getMainSelection();
            if(userSelect == NEW_GAME){
                System.out.println("Starting new game.");
                break;
            }
            if(userSelect == END_GAME){
                System.out.println("Thanks for playing coward! :-)");
                break;
            }
            MainLogic computerSelect = computerRandomMethod();
            if(computerWinMethod(userSelect, computerSelect)){
                System.out.println("You choose: " + userSelect + ", computer choose: " + computerSelect + ". ---> Computer WON !");
                computerPoints++;
            } else if (userWinMethod(userSelect, computerSelect)) {
                System.out.println("You choose: " + userSelect + ", computer choose: " + computerSelect + ". ---> You WON !");
                userPoints++;
            } else {
                System.out.println("DRAW. Both choice was: " + userSelect + ".");
            }
            System.out.println(userPoints + " - " + userName);
            System.out.println(computerPoints + " - Computer");
        }

        if(userPoints == numberOfPointsToWin){
            System.out.println("\n---> YOU WIN <---\n");
            userSelect = UserLogic.getRestartAfterEnd();
        } else if(computerPoints == numberOfPointsToWin) {
            System.out.println("\n---> COMPUTER WIN <---\n");
            userSelect = UserLogic.getRestartAfterEnd();
        }

        if(userSelect == NEW_GAME) {
            userPoints = 0;
            computerPoints = 0;
            launchMethod();
        }
    }
}