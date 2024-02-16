import java.util.Scanner;

/**
 * This class represents a tic-tac-toe game.
 */
public class TicTacToe {

  static Scanner scan = new Scanner(System.in);

  /**
   * The main method of the program.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    char[][] board = {
        { '-', '-', '-' },
        { '-', '-', '-' },
        { '-', '-', '-' }
    };

    printBoard(board);

    // Let's play!
    for (int i = 0; i < 9; i++) {
      if (i % 2 == 0) {
        updateBoard(board, askUser(board), 'X');

      } else {
        updateBoard(board, askUser(board), 'O');
      }

      checkWinCondition(checkWin(board));
    }

    System.out.print("\nIt's a tie!");
    scan.close();
  }

  /**
   * Prints the current state of the tic-tac-toe board.
   *
   * @param board The current state of the game board.
   */
  public static void printBoard(char[][] board) {
    System.out.print("\nLet's play tic tac toe!\n\n");
    for (int i = 0; i < board.length; i++) {
      System.out.print("\t");
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.print("\n\n");
    }
  }

  /**
   * Updates the game board with the player's move.
   *
   * @param board The current state of the game board.
   * @param spot  The row and column chosen by the player.
   * @param turn  The player's symbol ('X' or 'O').
   */
  public static void updateBoard(char[][] board, int[] spot, char turn) {
    board[spot[0]][spot[1]] = turn;
    System.out.print("\033[H\033[2J");
    System.out.flush();
    printBoard(board);
  }

  /**
   * Asks the user to pick a row and column.
   *
   * @param board The current state of the game board.
   * @return An array containing the row and column chosen by the user.
   */
  public static int[] askUser(char[][] board) {
    System.out.print("Pick a row and column number: ");
    int row = scan.nextInt();
    int column = scan.nextInt();
    while (board[row][column] != '-') {
      System.out.print("Oops! Spot taken, try again: ");
      row = scan.nextInt();
      column = scan.nextInt();
    }
    return new int[]{row, column};
  }

  /**
   * Checks if there's a winner based on the current state of the game board.
   *
   * @param check The result of the game evaluation.
   */
  public static void checkWinCondition(int check) {
    if (check == 3) {
      System.out.println("X wins");
      System.exit(0);
    } else if (check == -3) {
      System.out.println("O wins");
      System.exit(0);
    }
  }

  /**
   * Evaluates the game board to determine if there's a winner.
   *
   * @param board The current state of the game board.
   * @return An integer indicating the result of the game evaluation.
   */
  public static int checkWin(char[][] board) {
    int rows = checkRows(board);
    if (Math.abs(rows) == 3)
      return rows;

    int cols = checkColumns(board);
    if (Math.abs(cols) == 3)
      return cols;

    int leftDiagonal = checkLeft(board);
    if (Math.abs(leftDiagonal) == 3)
      return leftDiagonal;

    int rightDiagonal = checkRight(board);
    if (Math.abs(rightDiagonal) == 3)
      return rightDiagonal;

    return 0;
  }

  /**
   * Checks the rows of the game board for a winning condition.
   *
   * @param board The current state of the game board.
   * @return An integer indicating the result of the row check.
   */
  public static int checkRows(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == 'X')
          count++;
        else if (board[i][j] == 'O')
          count--;
      }

      if (count == 3 || count == -3)
        return count;
      count = 0;
    }
    return count;
  }

  /**
   * Checks the columns of the game board for a winning condition.
   *
   * @param board The current state of the game board.
   * @return An integer indicating the result of the column check.
   */
  public static int checkColumns(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[j][i] == 'X')
          count++;
        else if (board[j][i] == 'O')
          count--;
      }

      if (count == 3 || count == -3)
        return count;
      count = 0;
    }
    return count;
  }

  /**
   * Checks the left diagonal of the game board for a winning condition.
   *
   * @param board The current state of the game board.
   * @return An integer indicating the result of the left diagonal check.
   */
  public static int checkLeft(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      if (board[i][i] == 'X')
        count++;
      else if (board[i][i] == 'O')
        count--;
    }
    return count;
  }

  /**
   * Checks the right diagonal of the game board for a winning condition.
   *
   * @param board The current state of the game board.
   * @return An integer indicating the result of the right diagonal check.
   */
  public static int checkRight(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      if (board[2 - i][i] == 'X')
        count++;
      else if (board[2 - i][i] == 'O')
        count--;
    }
    return count;
  }

}