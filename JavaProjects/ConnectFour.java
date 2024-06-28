
/**
 * Connect Four Game
 * 
 * This program allows two players to play the Connect Four game.
 * Players take turns dropping their colored discs into a vertical grid,
 * and the first player to connect four discs of their color wins.
 * 
 * Author: Edem K. Anagbah
 * Date: 22/2/2024
 */
import java.util.Scanner;

public class ConnectFour {
    public static void main(String[] args) {
        playGame("R", "Y");

    }
    // Starts the ConnectFour game with default colours, Yellow and Red

    /**
     * This method sets up the game board and the game interactive
     * 
     * @param firstColr  Color of the first player's discs (R = Red)
     * @param secondColr Color of the second player's discs (Y = Yellow)
     * @return The final state of the game board after the game ends
     */
    public static String[][] playGame(String firstColr, String secondColr) {
        int rowNum = 6;
        int colNum = 8; // Made this 8 to make the connect grid have 7 columns
        Scanner input = new Scanner(System.in);
        boolean winner = false;

        // Initializes the game board with empty spaces
        String[][] actBoard = new String[rowNum][colNum];
        for (int i = 0; i < actBoard.length; i++) {
            for (int j = 0; j < actBoard[i].length; j++) {
                actBoard[i][j] = " ";
            }
        }
        int moves = 0;
        // Main game loop

        while (!winner && moves < rowNum * colNum) {
            // Displays the current state of the game board
            displayBoard(actBoard);
            // Player 1 (Red) makes a move
            System.out.println("Drop a red disc at column (0-6): ");
            int columnNumber = input.nextInt();
            positionColr(columnNumber, firstColr, actBoard);
            winner = checkForWinner(actBoard, firstColr);
            if (winner) {
                System.out.println(firstColr + " wins!");
                break;
            }
            // Displays the updated board
            displayBoard(actBoard);
            // Player 2 (Yellow) makes a move

            System.out.println("Drop a yellow disc at column (0-6): ");
            columnNumber = input.nextInt();

            positionColr(columnNumber, secondColr, actBoard);
            winner = checkForWinner(actBoard, secondColr);

            if (winner) {
                System.out.println(secondColr + " wins!");
                break;
            }

            moves += 2; // Each player makes a move
        }
        // Displays the result of the game (win or draw)
        if (!winner) {
            System.out.println("It's a draw!");
            System.out.println("Would like to play again? Enter 'y' or 'n': ");
            String response = input.next();
            if (response == "y") {
                playGame(firstColr, secondColr);
            }
        }
        // Close Scanner
        input.close();
        return actBoard;
    }

    /**
     * This method drops a disc of the specified color in the selected column
     * It takes in the parameters below;
     * 
     * @param userInput The column where the disc should be placed
     * @param colr      The color of the disc to be placed (R = Red, Y = Yellow)
     * @param board     The current state of the game board
     * @return The updated game board after placing the disc
     */
    public static String[][] positionColr(int userInput, String colr, String[][] board) {
        // Ensure user does not enter numbers greater than 6

        String uno = colr;
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][userInput] == " ") {
                if (userInput >= 7) {
                    System.out.println("Wrong column number. Enter again");
                    board[i][userInput] = " ";
                    break;
                }
                board[i][userInput] = uno;
                break;
            }
        }

        return board;
    }

    /**
     * This method displays the state of the game board at any time'
     * It takes the parameter;
     * 
     * @param board The current state of the game board
     */
    public static void displayBoard(String[][] board) {
        System.out.println(" 0 1 2 3 4 5 6");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                String cellValue = "|" + board[i][j];
                System.out.print(cellValue);
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    /**
     * This method checks for a winner horizontally, vertically, and diagonally.
     * It takes the below parameters
     * 
     * @param board The current state of the game board
     * @param colr  The color of the discs to check for a win (R = Red, Y = Yellow)
     * @return True if there is a winner, otherwise false
     */
    public static boolean checkForWinner(String[][] board, String colr) {
        // Creates a StringBuilder to store the characters in the row
        StringBuilder row = new StringBuilder();
        // Creates a StringBuilder to store the characters in the column
        StringBuilder column = new StringBuilder();

        // Check horizontally
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                row.append(board[i][j]);
            }
            // Checks if the row contains four consecutive 'R' characters
            if (row.toString().contains("RRRR")) {
                displayBoard(board);
                System.out.println("The Red player won (horizontally)!");
                return true;
            }
            // Checks if the row contains four consecutive 'Y' characters
            if (row.toString().contains("YYYY")) {
                displayBoard(board);
                System.out.println("The Yellow player won (horizontally)!");
                return true;
            }
            // Reset StringBuilder for the next row
            row.setLength(0);
        }

        // Check vertically
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                column.append(board[j][i]);
            }
            // Checks if the column contains four consecutive 'R' characters
            if (column.toString().contains("RRRR")) {
                displayBoard(board);
                System.out.println("The Red player won (vertically)!");
                return true;
            }
            // Checks if the column contains four consecutive 'Y' characters
            if (column.toString().contains("YYYY")) {
                displayBoard(board);
                System.out.println("The Yellow player won (vertically)!");
                return true;
            }
            // Reset StringBuilder for the next column
            column.setLength(0);
        }

        // Checks diagonally (from top-left to bottom-right)

        // From top-left to bottom-right the number of rows that have at least 4
        // diagonal cells are 3
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 0; j < board[i].length - 3; j++) {

                // Creates a StringBuilder to store the characters in the diagonal
                StringBuilder diagonal = new StringBuilder();

                // Traverses a diagonal line with a length of 4 (Connect Four rule)
                for (int k = 0; k < 4; k++) {
                    // Append the character at the current position to the diagonal StringBuilder
                    diagonal.append(board[i + k][j + k]);
                }

                // Checks if the diagonal contains four consecutive 'R' characters
                if (diagonal.toString().equals("RRRR")) {
                    displayBoard(board);
                    System.out.println("The Red player won!\n(diagonally (from top-left to bottom-right))!");
                    return true;
                }
                // Checks if the diagonal contains four consecutive 'Y' characters
                if (diagonal.toString().equals("YYYY")) {
                    displayBoard(board);
                    System.out.println("The Yellow player won!\n(diagonally (from top-left to bottom-right))");
                    return true;
                }
            }
        }

        // Checks diagonally (from top-right to bottom-left)

        // From top-right to bottom-left the number of rows that have at least 4
        // diagonal cells are 3
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 3; j < board[i].length; j++) {
                // Creates a StringBuilder to store the characters in the diagonal
                StringBuilder diagonal = new StringBuilder();

                // Traverse a diagonal line with a length of 4 (Connect Four rule)
                for (int k = 0; k < 4; k++) {
                    diagonal.append(board[i + k][j - k]);
                }
                // Checks if the diagonal contains four consecutive 'R' characters
                if (diagonal.toString().equals("RRRR")) {
                    displayBoard(board);
                    System.out.println("The Red player won!\n(diagonally (from top-right to bottom-left))");
                    return true;
                }
                // Checks if the diagonal contains four consecutive 'Y' characters
                if (diagonal.toString().equals("YYYY")) {
                    displayBoard(board);
                    System.out.println("The Yellow player won!\n(diagonally (from top-right to bottom-left))");
                    return true;
                }
            }
        }
        return false;
    }
}