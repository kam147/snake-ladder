package com.game.snakeLadder.service;

import java.util.Random;

public class CrookedDice implements Dice{
    @Override
    public Integer rollDice() {
        Random rand = new Random();
        return (1+rand.nextInt(3))*2;
    }
}
