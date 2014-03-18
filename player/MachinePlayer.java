/* MachinePlayer.java */

package player;

/**
 *  An implementation of an automatic Network player.  Keeps track of moves
 *  made by both players.  Can select a move for itself.
 */
public class MachinePlayer extends Player {


  public int color;
  public int searchDepth;
  public GameBoard gameBoard;
  public Move[] myMoves = int[10];
  public Move[] oppMoves = int[10];
  public static int moveindex = 0;
  public static int oppindex = 0;

  // Creates a machine player with the given color.  Color is either 0 (black)
  // or 1 (white).  (White has the first move.)
  public MachinePlayer(int color) {
      this.color = color;
      searchDepth = 1;
      gameBoard = new GameBoard();

  }

  // Creates a machine player with the given color and search depth.  Color is
  // either 0 (black) or 1 (white).  (White has the first move.)
  public MachinePlayer(int color, int searchDepth) {
      this.searchDepth = searchDepth;
      this.color = color;
  }

  // Returns a new move by "this" player.  Internally records the move (updates
  // the internal game board) as a move by "this" player.
  public Move chooseMove() {
    return new Move();

    // Best myBest = new Best();
    // Best oppReply;
    // myMoves
    // gameBoard[myBest.x][myBest.y] = color; (Updating gameboard)
    // myMoves[moveindex] = myBest;   //updating myMoves array
    // (if myBest.moveKind() == ADD 
          //moveindex++
    //  else {
        // *figure out how to change move*
    //minimax and gameboard evaluator


  } 

  // If the Move m is legal, records the move as a move by the opponent
  // (updates the internal game board) and returns true.  If the move is
  // illegal, returns false without modifying the internal state of "this"
  // player.  This method allows your opponents to inform you of their moves.
  public boolean opponentMove(Move m) {
    return false;

//if moveKind() == ADD;
    //oppindex++;


  }

  // If the Move m is legal, records the move as a move by "this" player
  // (updates the internal game board) and returns true.  If the move is
  // illegal, returns false without modifying the internal state of "this"
  // player.  This method is used to help set up "Network problems" for your
  // player to solve.
  public boolean forceMove(Move m) {
    return false;
  }

}
