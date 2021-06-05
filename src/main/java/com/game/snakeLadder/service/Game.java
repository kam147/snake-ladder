package com.game.snakeLadder.service;

import com.game.snakeLadder.entities.Board;
import com.game.snakeLadder.entities.Player;
import com.game.snakeLadder.entities.Snake;

import java.util.List;
import java.util.Queue;

public class Game {
    Queue<Player> playerQueue;
    Board board;
    Integer  maxAllowedTurn = 10;
    Dice dice;

    public Game(Queue<Player> playerQueue, Board board, Dice dice) {
        this.playerQueue = playerQueue;
        this.board = board;
        this.dice = dice;
    }

    public void addPlayer(Player player){
        this.playerQueue.add(player);
    }

    public Player start(){
        int turnCount = 0;
        Player playerTurn;
        while(turnCount<maxAllowedTurn && !playerQueue.isEmpty()){
            playerTurn = playerQueue.poll();
            Integer number= dice.rollDice();
//            System.out.println(number +" from dice");
            Integer updatedPosition = updatePosition(playerTurn.position+number);
            playerTurn.position = updatedPosition <=100 ? updatedPosition: playerTurn.position;
//            System.out.println(playerTurn.position+" current position ");
            if(playerTurn.position.equals(board.size)){
                return playerTurn;
            }
            turnCount++;
            playerQueue.add(playerTurn);
        }
        return null;
    }

    public Integer updatePosition(Integer position){
        List<Snake> snakeList = board.snakeList;
        for(Snake snake:snakeList){
            if(snake.source.equals(position)){
                return updatePosition(snake.destination);
            }
        }
        return position;
    }
}
