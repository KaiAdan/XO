package com.company_javarush_lesson_5;

import com.company_javarush_lesson_5.gamelogic.GameLogic;
import com.company_javarush_lesson_5.map.Map;
import com.company_javarush_lesson_5.map.RenderMap;
import com.company_javarush_lesson_5.player.Player;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

//создание игроков
        Player player_1 = new Player("Vasya");
        Player player_2 = new Player("Petya");

//настройка поля игры
        Map game = new Map();
        System.out.print("Выберите размер поля, минимальный размер равен 3: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size < 3){
            size = 3;
        }
        game.newMap(size);

//Запускаем игру
        GameLogic next = new GameLogic();
        while (game.startGame) {
            next.gameNextStep(game, player_1, player_2);
        }
    }
}
