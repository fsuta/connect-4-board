**Connect 4 Game in Java**

This is a Connect 4 game implemented in Java. The game follows the standard rules of Connect 4, where two players (Player 'X' and Player 'O') take turns dropping their tokens into one of seven columns of a grid. The goal is to be the first to connect four of their tokens in a row, either horizontally, vertically, or diagonally.
>
**Features:**
>
Game Board Representation: The game board is a 6x7 grid (6 rows and 7 columns). The board is represented using a 2D array and updated after each player’s move.
>
Player Turns: Player 'X' and Player 'O' alternate turns. Player 'X' always goes first.
>
Valid Moves: Players can only drop tokens into a column that isn't already full (max 6 tokens per column).
>
Game Status: The game determines whether a player has won, if the game is a draw, or if it's still undecided.
>
Game Display: The current state of the game board can be displayed as a string, showing the arrangement of tokens on the board.
>
**Methods:**
>
currentPlayer(): Returns the current player ('X' or 'O').
>
play(int column): Allows the current player to make a move in the given column, if it is valid.\
>
gameStatus(): Returns the status of the game ('X' or 'O' if there is a winner, 'D' for draw, 'U' if undecided).\
>
toString(): Constructs and returns a string representation of the game board.
