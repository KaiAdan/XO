package com.company_javarush_lesson_5.gamelogic;

import com.company_javarush_lesson_5.Main;
import com.company_javarush_lesson_5.map.Map;
import com.company_javarush_lesson_5.map.RenderMap;
import com.company_javarush_lesson_5.player.*;

import java.io.IOException;

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

    public void gameNextStep(Map game, Player player_1, Player player_2) throws IOException {
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

        VerificationWin win = new VerificationWin();
        if(win.checkWin(game, player)){
            logPlayers log = new logPlayers();
            System.out.println(player.name + " WINNER!!!");
            log.log(player.name);
            game.startGame = false;
        }
    }
}
