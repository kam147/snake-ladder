package com.game.snakeLadder.service;

import com.game.snakeLadder.entities.Board;
import com.game.snakeLadder.entities.Player;
import com.game.snakeLadder.enums.PieceColor;
import com.game.snakeLadder.enums.PlayerStatus;
import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.internal.junit.JUnitTestRule;
import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.Queue;

@RunWith(HierarchicalContextRunner.class)
@Category(JUnitTestRule.class)
public class TestGame {
    Game game;
    @Before
    public void before(){
        Player player = new Player("Ram", 0, PieceColor.BLUE, PlayerStatus.ACTIVE);
        Queue<Player> playerQueue= new ArrayDeque<>();
        playerQueue.add(player);
        Board board  = new Board(100);
        board.addSnake(25, 11);
        board.addSnake(77, 21);
        Dice dice = new NormalDice();
        game= new Game(playerQueue, board, dice);
    }

  public class UpdatePositionMethodTest {
      @Test
      public void it_should_be_same() {
          assertEquals(34, java.util.Optional.ofNullable(game.updatePosition(34)).get().intValue());
      }

      @Test
      public void it_should_be_reduce() {
          assertEquals(11, java.util.Optional.ofNullable(game.updatePosition(25)).get().intValue());
      }
  }

  public class StartMethodTest {
      @Test
      public void it_should_return_null() {
          assertNull(game.start());
      }
  }
}
