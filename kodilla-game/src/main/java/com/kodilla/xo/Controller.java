package com.kodilla.xo;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
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

    private final Checker checker = new Checker(this);
    private Line line = new Line();

    private int counter = 0;
    private boolean playable = true;
    private int xScore = 0;
    private int yScore = 0;
    private String current;


    void labelList(Label lbl) {

        Random random = new Random(9);
        int result = random.nextInt() + 1;

        List<Label> labels = new ArrayList<>();
        labels.add(label11);
        labels.add(label12);
        labels.add(label13);
        labels.add(label21);
        labels.add(label22);
        labels.add(label23);
        labels.add(label31);
        labels.add(label32);
        labels.add(label33);

        Label randomLabel = labels.get(result);
        if (lbl.getText().equals("")) {
            draw(randomLabel);
        } else {
            random.nextInt();
        }
    }


    void handle() {
        label11.setOnMouseClicked(event -> {
            checkLabel(label11);
        });
        label12.setOnMouseClicked(event -> {
            checkLabel(label12);
        });
        label13.setOnMouseClicked(event -> {
            checkLabel(label13);
        });
        label21.setOnMouseClicked(event -> {
            checkLabel(label21);
        });
        label22.setOnMouseClicked(event -> {
            checkLabel(label22);
        });
        label23.setOnMouseClicked(event -> {
            checkLabel(label23);
        });
        label31.setOnMouseClicked(event -> {
            checkLabel(label31);
        });
        label32.setOnMouseClicked(event -> {
            checkLabel(label32);
        });
        label33.setOnMouseClicked(event -> {
            checkLabel(label33);
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

    void checkLabel(Label lbl) {
        if (playable) {
            counter++;
            draw(lbl);
            checker.check();
            labelList(lbl);
        }
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