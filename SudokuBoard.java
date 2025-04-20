import java.util.*;
import java.io.*;

public class SudokuBoard{
   private int[][] board;
   
   public SudokuBoard(String fileName) throws FileNotFoundException {
      board = new int[9][9];
      Scanner input = new Scanner(new File(fileName));
   }
   
   public String toString(){
      return "";
   }
}