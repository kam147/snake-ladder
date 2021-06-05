package com.game.snakeLadder.entities;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public Integer size;
    public  List<Snake> snakeList;
    public List<Ladder> ladderList;

    public Board(Integer size) {
        this.size = size;
        this.snakeList = new ArrayList<>();
        this.ladderList = new ArrayList<>();
    }

   public Boolean addSnake(Integer source, Integer dest){
        if(dest>0 && source<this.size && dest<source) {
            this.snakeList.add(new Snake(source, dest));
            return true;
        }else{
            System.out.println("Unable to add snake, Destination should be less.");
            return false;
        }
    }

    public Boolean addLadder(Integer source, Integer dest){
        if(source>0 && source<dest && dest<this.size) {
            this.ladderList.add(new Ladder(source, dest));
            return true;
        }else{
            System.out.println("Unable to add ladder, Destination should be less.");
            return false;
        }
    }


}
