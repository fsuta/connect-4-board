package hw3;

public class Board {
	private char[][]board;
	private int rows;
	private int columns;
	private char currentPlayer;
	int moveCount=0;
	
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
		//initializes rows and columns
		this.rows=6;
		this.columns=7;
		//makes 6x7 grid with 2d array
		board = new char [rows][columns];
		//initializes all spots with a space character
		//tldr makes slots empty
		for (int row=0; row<rows;row++) {
			for (int col=0; col<columns;col++) {
				board [row][col]=' ';
				
			}
		}
		//x is #1 player
		currentPlayer='X';
		
		
		//throw new RuntimeException("Not implemented");
	}
	/**
	 * Gets the current player (either 'X' or 'O')
	 * 
	 * @return the current player
	 */
	public char currentPlayer() {
		return currentPlayer;
		//throw new RuntimeException("Not implemented");
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
		if (gameStatus()!='U') {
			throw new RuntimeException();
		}
		//if not within 1 and 7, return false
		if (moveCount>=42 || column<1 || column>7) {
			return false;
		}
		//find empty slot in column, sets to bottom row
		for (int index=rows-1;index>=0;index--) {
			//check if slot in current row and column
			//is empty
			if (board[index][column-1]==' ') {
				//sets that slot to the current player
				//X or O
				board[index][column-1]=currentPlayer;
				moveCount++;
				//alteratnes player
				if (currentPlayer=='X'){
					currentPlayer='O';
				}else {
					currentPlayer='X';
				}
				return true;
			}
		}
		return false;
		//throw new RuntimeException("Not implemented");
	}

	private boolean wins(char player){
		for (int row=0; row<rows-3;row++) {
			for (int col=0; col<columns;col++) {
				if(player == board[row][col] 
						&& player == board[row+1][col]
						&& player == board[row+2][col]
						&& player == board[row+3][col]) {
					return true;
			}
		}
	}
		for (int row=0; row<rows-3;row++) {
			for (int col=0; col<columns-3;col++) {
				if(player == board[row][col] 
						&& player == board[row+1][col+1]
						&& player == board[row+2][col+2]
						&& player == board[row+3][col+3]) {
					return true;
				}
			}
		}
		for (int row=3; row<rows;row++) {
			for (int col=0; col<columns-3;col++) {
				if(player == board[row][col] 
						&& player == board[row-1][col+1]
						&& player == board[row-2][col+2]
						&& player == board[row-3][col+3]) {
					return true;
				}
			}
		}
		for (int row=0; row<rows;row++) {
			for (int col=0; col<columns-3;col++) {
				if(player == board[row][col] 
						&& player == board[row][col+1]
						&& player == board[row][col+2]
						&& player == board[row][col+3]) {
					return true;
				}
			}
		}
		return false;
			
		//somehow count wins vertically, horizontally,
		//diagonally and draw
	}
	
	/**
	 * Determine the status of the game.
	 * 
	 * @return {@code 'X'} or {@code 'O'} if either player has won, {@code 'D'} if
	 * the game is a draw, and {@code 'U'} if the game is still undecided.
	 */
	public char gameStatus() {
		if( wins('X')){
			return 'X';
		}
		if (wins('O')) {
			return 'O';
		}
		if (moveCount>=42) {
			return 'D';
		}
			return 'U';
			
		}
	
	//throw new RuntimeException("Not implemented");

	/**
	 * Construct a string that depicts the sate of the game.
	 * (See the writeup for what that string should look like.)
	 * 
	 * @return a string depicting the game board
	 */
	public String toString() {
		String gameBoard="";
		for (int row=0; row<rows;row++) {
			for (int col=0; col<columns;col++) {
				
				gameBoard+=board [row][col]+" ";
			}
			gameBoard+='\n';
	}
		gameBoard+=("-------------\n");
		gameBoard+=("1 2 3 4 5 6 7");
		return gameBoard;
		//throw new RuntimeException("Not implemented");
	}
}
