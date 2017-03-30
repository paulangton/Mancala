package models;

import java.util.List;
import rules.MancalaRule;

/**
 * Created by Paul on 12/9/2016.
 * TODO make sure model is in line with new information and refactored design - bao, oware, kalah
 * PROGRESS:
 * 3/29: removed unneeded methods getPlayers, nextTurn
 *       Board interface subsumed by model because board representation of state will not be
 *       relevant outside its corresponding model implementation
 *
 * To represent a game of mancala.
 * Mancala has rules defined by the following (from https://en.wikipedia.org/wiki/Mancala):
 *
 * Most mancala games share a common general game play. Players begin by placing a certain number of
 * seeds, prescribed for the particular game, in each of the pits on the game board. A player may
 * count their stones to plot the game. A turn consists of removing all seeds from a pit, "sowing"
 * the seeds (placing one in each of the following pits in sequence) and capturing based on the
 * state of board. This leads to the English phrase "count and capture" sometimes used to describe
 * the gameplay. Although the details differ greatly, this general sequence applies to all games.
 */
public interface MancalaModel {

  /**
   * Gets the cup states from this model.
   * @return a {@code List<Cup>} representing this board
   */
  Cup[][] getCups();


  /**
   * Executes a move in the game according to the given list of rules (called sowing)
   * @param cup   the cup to sow from
   */
  void sow(Cup cup);

  /**
   * If it is the turn of the player who moved first, true, false otherwise
   * @return
   */
  boolean isFirstPlayerTurn();

  /**
   * toggles the turn
   * @param turn
   * @return
   */
  boolean toggleTurn(int turn);

  /**
   * Gets the score of the
   * @param firstPlayer the first player to sow in the game
   * @return an integer representing the given player's score ()
   */
  int getScore(boolean firstPlayer);

  /**
   * Gets the length of the board. Length is defined as the amount of cups under any one player's
   * control
   * @return an integer representing board length
   */
  int getBoardLength();

  /**
   * Checks if the game is over
   * @return true if the game is over, false otherwise
   */
  boolean isGameOver();

  /**
   * Sets up the board
   */
  void init();
}
