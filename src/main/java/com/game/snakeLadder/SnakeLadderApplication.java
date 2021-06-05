package com.game.snakeLadder;

import com.game.snakeLadder.controller.GameController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnakeLadderApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SnakeLadderApplication.class, args);
		GameController gameController = new GameController();
		gameController.startGame();
	}

}
