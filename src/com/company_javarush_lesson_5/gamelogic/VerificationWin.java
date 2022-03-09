package com.company_javarush_lesson_5.gamelogic;

import com.company_javarush_lesson_5.map.Map;
import com.company_javarush_lesson_5.player.Player;

public class VerificationWin {
    private int row;
    private int col;
    private Map field;

    private  boolean checkByLine(int row, int col, Map field) {
        if (col == 0){
            if (field.getGameField()[row][col] == field.getGameField()[row][col + 1] && field.getGameField()[row][col] == field.getGameField()[row][col + 2]){
                return true;
            }
        }
        else if(col == field.getGameFieldSize() - 1){
            if (field.getGameField()[row][col] == field.getGameField()[row][col - 1] && field.getGameField()[row][col] == field.getGameField()[row][col - 2]){
                return true;
            }
        }
        else {
            if (field.getGameField()[row][col] == field.getGameField()[row][col + 1] && field.getGameField()[row][col] == field.getGameField()[row][col - 1]){
                return true;
            }
        }

        return false;
    }

    private boolean checkByCol(int row, int col, Map field){
        if (row == 0){
            if (field.getGameField()[row][col] == field.getGameField()[row + 1][col] && field.getGameField()[row][col] == field.getGameField()[row + 2][col]){
                return true;
            }
        }
        else if (row == field.getGameFieldSize() - 1){
            if (field.getGameField()[row][col] == field.getGameField()[row - 1][col] && field.getGameField()[row][col] == field.getGameField()[row - 2][col]){
                return true;
            }
        }
        else {
            if (field.getGameField()[row][col] == field.getGameField()[row +1][col] && field.getGameField()[row][col] == field.getGameField()[row - 1][col]){
                return true;
            }
        }
        return false;
    }

    private boolean diagonal(int row, int col, Map field){
        if (row == 0 && col == 0){
            if (col != field.getGameFieldSize() - 1 && col != 0 && row != field.getGameFieldSize() - 1 && row != 0 && field.getGameField()[row][col] == field.getGameField()[row + 1][col + 1] && field.getGameField()[row][col] == field.getGameField()[row + 2][col + 2]){
                return true;
            }
        }
        else if (row == 0 && col == field.getGameFieldSize() - 1){
            if (col != field.getGameFieldSize() - 1 && col != 0 && row != field.getGameFieldSize() - 1 && row != 0 && field.getGameField()[row][col] == field.getGameField()[row - 1][col + 1] && field.getGameField()[row][col] == field.getGameField()[row - 2][col + 2]){
                return true;
            }
        }
        else if (row == field.getGameFieldSize() - 1 && col == field.getGameFieldSize() - 1){
            if (col != field.getGameFieldSize() - 1 && col != 0 && row != field.getGameFieldSize() - 1 && row != 0 && field.getGameField()[row][col] == field.getGameField()[row - 1][col - 1] && field.getGameField()[row][col] == field.getGameField()[row - 2][col - 2]){
                return true;
            }
        }
        else if (row == field.getGameFieldSize() - 1 && col == 0) {
            if (col != field.getGameFieldSize() - 1 && col != 0 && row != field.getGameFieldSize() - 1 && row != 0 && field.getGameField()[row][col] == field.getGameField()[row + 1][col - 1] && field.getGameField()[row][col] == field.getGameField()[row + 2][col - 2]) {
                return true;
            }
        }
        else {
            if (col != field.getGameFieldSize() - 1 && col != 0 && row != field.getGameFieldSize() - 1 && row != 0 && field.getGameField()[row][col] == field.getGameField()[row - 1][col - 1] && field.getGameField()[row][col] == field.getGameField()[row + 1][col + 1]){
                return true;
            }
            else if(col != field.getGameFieldSize() - 1 && col != 0 && row != field.getGameFieldSize() - 1 && row != 0 && field.getGameField()[row][col] == field.getGameField()[row - 1][col + 1] && field.getGameField()[row][col] == field.getGameField()[row + 1][col - 1]){
                return true;
            }
        }
        return false;
    }

    public  boolean checkWin(Map field, Player player){
        this.field = field;
        this.row = player.lastChoise[0];
        this.col = player.lastChoise[1];
        if (checkByLine(row, col, field) || checkByCol(row, col, field) || diagonal(row, col, field)) {
            return true;
        }

        return false;
    }
}
