package com.company_javarush_lesson_5.gamelogic;

import com.company_javarush_lesson_5.map.Map;

public class VerificationWin {

    private Map map;
    private String[][] gameField;
    private int row;
    private int col;

    private  boolean checkByFirstLine(int row, int col) {
        if (row == 0) {
            if (gameField[0][col] == gameField[0][col + 1] && gameField[0][col] == gameField[0][col + 2]) {
                return true;
            }
        }
        return false;
    }

    public  boolean checkWin(int[] choiceCellByPlayer, Map map){
        this.map = map;
        this.gameField = map.getGameField();

        this.row = choiceCellByPlayer[0];
        this.col = choiceCellByPlayer[1];

        if (checkByFirstLine(row, col)){
            return true;
        }
        return false;
    }
}
