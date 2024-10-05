package hw3;

public class Board {
	// TODO
	// Add whatever private fields you need here.
	// Remember, only variables of type int, char, boolean, and 1D and 2D arrays
	// of these types are allowed.
	//
	// As always, you may also add private helper methods to the class.  That will
	// likely be very useful on this assignment.

	/**
	 * Constructs a new empty connect 4 game board with player X being the first player
	 * and player 'O' being the second player.
	 */
	public Board() {
		throw new RuntimeException("Not implemented");
	}

	/**
	 * Gets the current player (either 'X' or 'O')
	 * 
	 * @return the current player
	 */
	public char currentPlayer() {
		throw new RuntimeException("Not implemented");
	}

	/**
	 * The current player makes a move in a given column if it is a valid move.
	 * Throws an exception if the game is already over.
	 * 
	 * @param column the column in which to make a move.  For the move to be valid,
	 * the column value must an {@code int} between 1 and 7 inclusive, and
	 * there must have been fewer than 6 moves already made in the given column.
	 * @return {@code true} if the move is valid and false if it is not valid.
	 * @throws RuntimeException if the game is already over.
	 */
	public boolean play(int column) {
		throw new RuntimeException("Not implemented");
	}

	/**
	 * Determine the status of the game.
	 * 
	 * @return {@code 'X'} or {@code 'O'} if either player has won, {@code 'D'} if
	 * the game is a draw, and {@code 'U'} if the game is still undecided.
	 */
	public char gameStatus() {
		throw new RuntimeException("Not implemented");
	}

	/**
	 * Construct a string that depicts the sate of the game.
	 * (See the writeup for what that string should look like.)
	 * 
	 * @return a string depicting the game board
	 */
	public String toString() {
		throw new RuntimeException("Not implemented");
	}
}
