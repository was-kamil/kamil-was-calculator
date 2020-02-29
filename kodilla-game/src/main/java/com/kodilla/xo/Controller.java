package com.kodilla.xo;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import java.util.Random;


public class Controller {

    @FXML
    private Label label11;
    @FXML
    private Label label12;
    @FXML
    private Label label13;
    @FXML
    private Label label21;
    @FXML
    private Label label22;
    @FXML
    private Label label23;
    @FXML
    private Label label31;
    @FXML
    private Label label32;
    @FXML
    private Label label33;
    @FXML
    private Label resultsLabel;
    @FXML
    private Label scoreLabel;
    @FXML
    private Button newGame;
    @FXML
    private Button endGame;
    @FXML
    private Group group;

    @FXML
    void initialize() {
        handle();
    }
    @FXML
    void closeButtonAction() {
        Stage stage = (Stage) endGame.getScene().getWindow();
        stage.close();
    }

    Random rnd = new Random();

    private final Checker checker = new Checker(this);
    private Line line = new Line();

    private int counter = 0;
    private boolean playable = true;
    private int xScore = 0;
    private int yScore = 0;
    private String current;


    void handle() {
        label11.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label11);
                checker.check();
            }
        });
        label12.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label12);
                checker.check();
            }
        });
        label13.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label13);
                checker.check();
            }
        });
        label21.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label21);
                checker.check();
            }
        });
        label22.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label22);
                checker.check();
            }
        });
        label23.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label23);
                checker.check();
            }
        });
        label31.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label31);
                checker.check();
            }
        });
        label32.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label32);
                checker.check();
            }
        });
        label33.setOnMouseClicked(event -> {
            if (playable) {
                counter++;
                draw(label33);
                checker.check();
            }
        });
        newGame.setOnMouseClicked(event -> {
            Label[][] lblArr = {{label11, label12, label13}, {label21, label22, label23}, {label31, label32, label33}};
            for (Label[] labels : lblArr) {
                for (Label label : labels) {
                    label.setText("");
                }
            }
            playable = true;
            counter = 0;
            group.getChildren().remove(line);
        });
    }

    void draw(Label lbl) {
        if (counter % 2 == 0) {
            lbl.setText("O");
            lbl.setTextFill(Paint.valueOf("#0000ff"));
            current = "O";
        } else {
            lbl.setText("X");
            lbl.setTextFill(Paint.valueOf("#228B22"));
            current = "X";
        }
    }

    void drawLine(double start1, double start2, double end1, double end2) {
        line.setStartX(start1);
        line.setStartY(start2);
        line.setEndX(end1);
        line.setEndY(end2);
        line.setStroke(Color.RED);
        line.setStrokeWidth(10);
        group.getChildren().add(line);
    }

    boolean isSecondDiagonalTheSame() {
        return label13.getText().equals(current) && label22.getText().equals(current) && label31.getText().equals(current);
    }

    boolean isFirstDiagonalTheSame() {
        return label11.getText().equals(current) && label22.getText().equals(current) && label33.getText().equals(current);
    }

    boolean isThirdColumnTheSame() {
        return label13.getText().equals(current) && label23.getText().equals(current) && label33.getText().equals(current);
    }

    boolean isSecondColumnTheSame() {
        return label12.getText().equals(current) && label22.getText().equals(current) && label32.getText().equals(current);
    }

    boolean isFirstColumnTheSame() {
        return label11.getText().equals(current) && label21.getText().equals(current) && label31.getText().equals(current);
    }

    boolean isThirdRowTheSame() {
        return label31.getText().equals(current) && label32.getText().equals(current) && label33.getText().equals(current);
    }

    boolean isSecondRowTheSame() {
        return label21.getText().equals(current) && label22.getText().equals(current) && label23.getText().equals(current);
    }

    boolean isFirstRowTheSame() {
        return label11.getText().equals(current) && label12.getText().equals(current) && label13.getText().equals(current);
    }

    public int getyScore() {
        return yScore;
    }

    public Label getResultsLabel() {
        return resultsLabel;
    }

    public int getxScore() {
        return xScore;
    }

    public String getCurrent() {
        return current;
    }

    public int getCounter() {
        return counter;
    }

    public Label getScoreLabel() {
        return scoreLabel;
    }

    public void setyScore(int yScore) {
        this.yScore = yScore;
    }

    public void setxScore(int xScore) {
        this.xScore = xScore;
    }

    public void setPlayable(boolean playable) {
        this.playable = playable;
    }
}