package com.company_javarush_lesson_5.map;

public class Map {
    private String[][] gameField;
    private int fieldSize;
    public boolean startGame = true;

    public void newMap(int size){
        this.fieldSize = size;
        this.gameField = new String[size][size];
    }

    public String[][] getGameField(){
        return gameField;
    }

    public int getGameFieldSize(){
        return fieldSize;
    }

}
