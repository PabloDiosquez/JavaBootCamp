import java.util.Scanner;

public class TicTacToe {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    char[][] board = {
        { '-', '-', '-' },
        { '-', '-', '-' },
        { '-', '-', '-' }
    };

    System.out.println("\nLet's play tic tac toe");
    printBoard(board);

    int[] response;
    for (int i = 0; i < 9; i++) {
      if (i % 2 == 0) {
        response = askUser(board);
        updateBoard(board, response, 'X');
        
      } else {
        response = askUser(board);
        updateBoard(board, response, 'O');
      }

      int check = checkWin(board);
      if(check == 3){
        System.out.println("X wins");
        break;
      } else if(check == -3){
        System.out.println("O wins");
        break;
      }
    }

    scan.close();
  }

  /**
   * Function name - printBoard()
   * 
   * @param board (char[][])
   * 
   *              Inside the function:
   *              1. print a new line.
   *              2. print the board.
   *              • separate each row by two lines.
   *              • each row precedes a tab of space
   *              • each character in the grid has one space from the other
   *              character
   */
  public static void printBoard(char[][] board) {
    System.out.print("\n");
    for (int i = 0; i < board.length; i++) {
      System.out.print("\t");
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.print("\n\n");
    }
  }

  public static void updateBoard(char[][] board, int[] response, char turn){
        board[response[0]][response[1]] = turn;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nLet's play tic tac toe");
        printBoard(board);
  }

  /**
   * Function name – askUser
   * 
   * @param board (char[][] board)
   * @return spot (int[])
   * 
   * Inside the function
   *  1. Asks the user: - pick a row and column number:
   *  2. Check if the spot is taken. If so, let the user choose again.
   *  3. Return the row and column in an int[] array.
   * 
   */
  public static int[] askUser(char[][] board) {
    System.out.print("Pick a row and column number: ");
    int row = scan.nextInt();
    int column = scan.nextInt();

    return new int[] { row, column };
  }

  /**
   * Task 6 - Write a function that determines the winner
   * Function name - checkWin
   * 
   * @param board (char[][])
   * @return count (int)
   * 
   *         Inside the function:
   *         1. Make a count variable that starts at 0.
   *         2. Check every row for a straight X or straight O (Task 7).
   *         3. Check every column for a straight X or straight O (Task 8).
   *         4. Check the left diagonal for a straight X or straight O (Task 9).
   *         5. Check the right diagonal for a straight X or straight O (Task 10).
   */
  public static int checkWin(char[][] board){
    int rows = checkRows(board);
    if(Math.abs(rows) == 3) return rows;

    int cols = checkColumns(board);
    if(Math.abs(cols) == 3) return cols;
    
    int leftDiagonal = checkLeft(board); 
    if(Math.abs(leftDiagonal) == 3) return leftDiagonal;
    
    int rightDiagonal = checkRight(board);
    if(Math.abs(rightDiagonal) == 3) return rightDiagonal;

    return 0;
  }

  public static int checkRows(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if(board[i][j] == 'X') count++;
        else if(board[i][j] == 'O') count--;
      }

      if(count == 3 || count == -3) return count;
      count = 0;
    }
    return count;
  }


public static int checkColumns(char[][] board) {
    int count = 0;
    for (int j = 0; j < board.length; j++) {
      for (int i = 0; i < board[j].length; i++) {
        if(board[i][j] == 'X') count++;
        else if(board[i][j] == 'O') count--;
      }
      
      if(count == 3 || count == -3) return count;
      count = 0;
    }
    return count;
}


public static int checkLeft(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      if(board[i][i] == 'X') count++;
      else if(board[i][i] == 'O') count--;
    }
    return count;
}


// TODO 1
public static int checkRight(char[][] board) {
  int count = 0;
  return count;
}

}