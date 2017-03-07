package models;

import java.util.List;

/**
 * Created by Paul on 12/9/2016.
 * To represent a game of mancala.
 */
public interface MancalaModel {

  /**
   * Executes a move in the game according to the given list of rules
   * @param board the current board configuration
   * @param turn  which players turn it is
   * @param cup   the cup to move from
   * @param rules the rules to apply to the move
   */
  void move(Board board, int turn, Cup cup, List<MancalaRule> rules);

  /**
   * Gets which player's turn it is.
   * @return 1 if it is player 1's turn, 2 for player 2, etc.
   */
  int getTurn();

  /**
   * A game is over if there are no mancala pieces left on the board, i.e. every piece is in a
   * {@code ScoreCup}.
   * @return true if the game is over, false otherwise
   */
  boolean isGameOver(Board board);
}