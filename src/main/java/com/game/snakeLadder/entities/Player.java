package com.game.snakeLadder.entities;

import com.game.snakeLadder.enums.PieceColor;
import com.game.snakeLadder.enums.PlayerStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    public String name;
    public Integer position;
    public PieceColor pieceColor;
    public PlayerStatus playerStatus;

    public Player(String name, Integer position, PieceColor pieceColor, PlayerStatus playerStatus) {
        this.name = name;
        this.position = position;
        this.pieceColor = pieceColor;
        this.playerStatus = playerStatus;
    }
}
