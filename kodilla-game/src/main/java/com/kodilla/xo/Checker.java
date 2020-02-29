package com.kodilla.xo;


public class Checker {
    private final Controller controller;

    public Checker(Controller controller) {
        this.controller = controller;
    }


    public void check() {
        if (controller.getCounter() >= 5) {
            if (controller.isFirstRowTheSame()) {
                if (controller.getCurrent().equals("X")) {
                    controller.setxScore(controller.getxScore() + 1);
                } else {
                    controller.setyScore(controller.getyScore() + 1);
                }
                controller.drawLine(50, 100, 550, 100);
                controller.getResultsLabel().setText(String.format("Player %s WINS ", controller.getCurrent()));
                controller.getScoreLabel().setText(String.format("SCORES: \nPlayer X -->  %d \nPlayer O -->  %d ", controller.getxScore(), controller.getyScore()));
                controller.setPlayable(false);
            } else if (controller.isSecondRowTheSame()) {
                if (controller.getCurrent().equals("X")) {
                    controller.setxScore(controller.getxScore() + 1);
                } else {
                    controller.setyScore(controller.getyScore() + 1);
                }
                controller.drawLine(50, 300, 550, 300);
                controller.getResultsLabel().setText(String.format("Player %s WINS ", controller.getCurrent()));
                controller.getScoreLabel().setText(String.format("SCORES: \nPlayer X -->  %d \nPlayer O -->  %d ", controller.getxScore(), controller.getyScore()));
                controller.setPlayable(false);
            } else if (controller.isThirdRowTheSame()) {
                if (controller.getCurrent().equals("X")) {
                    controller.setxScore(controller.getxScore() + 1);
                } else {
                    controller.setyScore(controller.getyScore() + 1);
                }
                controller.drawLine(50, 500, 550, 500);
                controller.getResultsLabel().setText(String.format("Player %s WINS ", controller.getCurrent()));
                controller.getScoreLabel().setText(String.format("SCORES: \nPlayer X -->  %d \nPlayer O -->  %d ", controller.getxScore(), controller.getyScore()));
                controller.setPlayable(false);
            } else if (controller.isFirstColumnTheSame()) {
                if (controller.getCurrent().equals("X")) {
                    controller.setxScore(controller.getxScore() + 1);
                } else {
                    controller.setyScore(controller.getyScore() + 1);
                }
                controller.drawLine(100, 50, 100, 550);
                controller.getResultsLabel().setText(String.format("Player %s WINS ", controller.getCurrent()));
                controller.getScoreLabel().setText(String.format("SCORES: \nPlayer X -->  %d \nPlayer O -->  %d ", controller.getxScore(), controller.getyScore()));
                controller.setPlayable(false);
            } else if (controller.isSecondColumnTheSame()) {
                if (controller.getCurrent().equals("X")) {
                    controller.setxScore(controller.getxScore() + 1);
                } else {
                    controller.setyScore(controller.getyScore() + 1);
                }
                controller.drawLine(300, 50, 300, 550);
                controller.getResultsLabel().setText(String.format("Player %s WINS ", controller.getCurrent()));
                controller.getScoreLabel().setText(String.format("SCORES: \nPlayer X -->  %d \nPlayer O -->  %d ", controller.getxScore(), controller.getyScore()));
                controller.setPlayable(false);
            } else if (controller.isThirdColumnTheSame()) {
                if (controller.getCurrent().equals("X")) {
                    controller.setxScore(controller.getxScore() + 1);
                } else {
                    controller.setyScore(controller.getyScore() + 1);
                }
                controller.drawLine(500, 50, 500, 550);
                controller.getResultsLabel().setText(String.format("Player %s WINS ", controller.getCurrent()));
                controller.getScoreLabel().setText(String.format("SCORES: \nPlayer X -->  %d \nPlayer O -->  %d ", controller.getxScore(), controller.getyScore()));
                controller.setPlayable(false);
            } else if (controller.isFirstDiagonalTheSame()) {
                if (controller.getCurrent().equals("X")) {
                    controller.setxScore(controller.getxScore() + 1);
                } else {
                    controller.setyScore(controller.getyScore() + 1);
                }
                controller.drawLine(50, 50, 550, 550);
                controller.getResultsLabel().setText(String.format("Player %s WINS ", controller.getCurrent()));
                controller.getScoreLabel().setText(String.format("SCORES: \nPlayer X -->  %d \nPlayer O -->  %d ", controller.getxScore(), controller.getyScore()));
                controller.setPlayable(false);
            } else if (controller.isSecondDiagonalTheSame()) {
                if (controller.getCurrent().equals("X")) {
                    controller.setxScore(controller.getxScore() + 1);
                } else {
                    controller.setyScore(controller.getyScore() + 1);
                }
                controller.drawLine(550, 50, 50, 550);
                controller.getResultsLabel().setText(String.format("Player %s WINS ", controller.getCurrent()));
                controller.getScoreLabel().setText(String.format("SCORES: \nPlayer X -->  %d \nPlayer O -->  %d ", controller.getxScore(), controller.getyScore()));
                controller.setPlayable(false);
            } else if (controller.getCounter() == 9) {
                controller.getResultsLabel().setText("Players draw");
                controller.getScoreLabel().setText(String.format("SCORES: \nPlayer X -->  %d \nPlayer O -->  %d ", controller.getxScore(), controller.getyScore()));
            }
        }

        if (controller.getCounter() == 9) {
            controller.getResultsLabel().setText("Players draw");
            controller.getScoreLabel().setText(String.format("SCORES: \nPlayer X -->  %d \nPlayer O -->  %d ", controller.getxScore(), controller.getyScore()));
        }
    }
}