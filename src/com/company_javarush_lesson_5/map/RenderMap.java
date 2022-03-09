package com.company_javarush_lesson_5.map;

public class RenderMap {
    public Map map;
    public void render(Map map){
        this.map = map;
        System.out.println("render");
        for (int i = 0; i < map.getGameFieldSize(); i++){
            for (int j = 0; j < map.getGameFieldSize(); j++){
                String[][] renderMap = map.getGameField();
                System.out.print(" | " + renderMap[i][j]);
            }
            System.out.println();
        }
    }

    public Map getMap() {
        return map;
    }
}
