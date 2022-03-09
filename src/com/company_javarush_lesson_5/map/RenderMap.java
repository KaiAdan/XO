package com.company_javarush_lesson_5.map;

public class RenderMap {
    public Map map;
    public void renderMap(Map map){
        this.map = map;
        for (int i = 0; i < map.getGameFieldSize(); i++){
            for (int j = 0; j < map.getGameFieldSize(); j++){
                if (map.getGameField()[i][j] != null) {
                    System.out.print(" | " + map.getGameField()[i][j] + " | ");
                }
                else {
                    System.out.print(" | " +  " " + " | ");
                }
            }
            System.out.println();
        }
    }

    public Map getMap() {
        return map;
    }
}
