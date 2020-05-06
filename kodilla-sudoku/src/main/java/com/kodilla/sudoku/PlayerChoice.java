package com.kodilla.sudoku;

public class PlayerChoice {
    private PlayerChoiceEnum choiceType;
    private int row;
    private int column;
    private int value;

    public PlayerChoice(PlayerChoiceEnum choiceType) {
        this.choiceType = choiceType;
    }

    public PlayerChoice(int column, int row, int value) {
        this.choiceType = PlayerChoiceEnum.SET_VALUE;
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public PlayerChoiceEnum getChoiceType() {
        return choiceType;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "UserChoice {" +
                "column=" + column +
                ", row=" + row +
                ", value=" + value +
                '}';
    }
}
