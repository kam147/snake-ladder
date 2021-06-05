package com.game.snakeLadder.controller;

import com.game.snakeLadder.entities.Board;
import com.game.snakeLadder.entities.Player;
import com.game.snakeLadder.enums.PieceColor;
import com.game.snakeLadder.enums.PlayerStatus;
import com.game.snakeLadder.service.CrookedDice;
import com.game.snakeLadder.service.Dice;
import com.game.snakeLadder.service.Game;
import com.game.snakeLadder.service.NormalDice;

import java.util.ArrayDeque;
import java.util.Queue;

public class GameController {


    public void startGame(){
        System.out.println("Game started------");
        Player player = new Player("Ram", 0, PieceColor.BLUE, PlayerStatus.ACTIVE);
        Queue<Player> playerQueue= new ArrayDeque<>();
        playerQueue.add(player);
        Board board  = new Board(100);
        board.addSnake(25, 11);
        board.addSnake(77, 21);
        Dice dice = new NormalDice();
//        Dice dice = new CrookedDice();
        Game game= new Game(playerQueue, board, dice);
        Player winnerPlayer = game.start();
        if(winnerPlayer!=null){
            System.out.println(winnerPlayer.name+ " is a winner");
        }else{
            System.out.println("Game tie");
        }

    }
}
