package com.game.snakeLadder.service;

import java.util.Random;

public class NormalDice implements Dice {
    @Override
    public Integer rollDice() {
        Random rand = new Random();
        return 1+rand.nextInt(6);
    }
}
