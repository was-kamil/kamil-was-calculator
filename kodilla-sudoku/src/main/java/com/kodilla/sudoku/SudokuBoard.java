package com.kodilla.sudoku;

public class SudokuBoard {
    SudokuElement[][] boardOfElements = new SudokuElement[9][9];

    public SudokuBoard() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                boardOfElements[x][y] = new SudokuElement(SudokuElement.EMPTY);
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("\n");
        StringBuilder printBoard = new StringBuilder("       1   2   3   4   5   6   7   8   9" + "\n \n");

        for (int x = 0; x < 9; x++) {

            printBoard.append(1 + x).append("    |");
            for (int y = 0; y < 9; y++) {
                if (boardOfElements[x][y].getValue() == SudokuElement.EMPTY) {
                    printBoard.append("   ");
                } else {
                    printBoard.append(" ");
                    printBoard.append(boardOfElements[x][y].getValue());
                    printBoard.append(" ");
                }
                printBoard.append("|");
            }
            printBoard.append("\n");
        }
        return printBoard.toString();
    }
}