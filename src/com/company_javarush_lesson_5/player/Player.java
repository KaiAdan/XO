package com.company_javarush_lesson_5.player;

import com.company_javarush_lesson_5.map.Map;

import java.util.Scanner;

public class Player {
    public static int countPlayer = 0;
    public String name;

    private static int step = 0;
    private static String symbol = "X";

    public Player(String name){
        this.name = name;
        countPlayer++;
    }

    public int[] choiceCell(){
        int cell[] = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice row: ");
        cell[0] = scanner.nextInt();
        System.out.print("Choice col: ");
        cell[1] = scanner.nextInt();


        switchPlayer();
        return cell;
    }

    public static int getStep() {
        return step;
    }

    private void switchPlayer(){
        if (countPlayer > 1 && countPlayer < 3){
            if (step == 0){
                step = 1;
                symbol = "O";
            }
            else {
                step = 0;
                symbol = "X";
            }
        }
    }






//end class
}
