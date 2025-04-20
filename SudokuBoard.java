import java.util.*;
import java.io.*;

public class SudokuBoard{
   private char[][] board;
   
   public SudokuBoard(String fileName) throws FileNotFoundException {
      board = new char[9][9];
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
         for(int r = 0; r < board.length; r++){
            String line = input.nextLine();
            for(int c = 0; c < board[r].length; c++){
               board[r][c] = line.charAt(c);
            }
         }
      }
   }
   
   public String toString(){
      String board = "";
      return board;
   }
}