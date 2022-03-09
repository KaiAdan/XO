package com.company_javarush_lesson_5.gamelogic;

import com.company_javarush_lesson_5.map.Map;
import com.company_javarush_lesson_5.map.RenderMap;
import com.company_javarush_lesson_5.player.*;

public class GameLogic {

    private int stepGame = 0;
    private int[] choiceCellByPlayer;
    private RenderMap render = new RenderMap();
    private Map game;

    public int[] getChoiceCellByPlayer() {
        return choiceCellByPlayer;
    }

    public int getStepGame() {
        return stepGame;
    }

    public void gameNextStep(Map game, Player player_1, Player player_2){
        this.game = game;
        Player player;
        if (Player.getStep() == 1){
            player = player_2;
        }
        else {
            player = player_1;
        }

        player.choiceCell(game);

        this.render.renderMap(game);


//        VerificationWin win = new VerificationWin();
//        win.checkWin(choiceCellByPlayer, render.getMap());

    }
}
