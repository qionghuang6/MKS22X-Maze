import java.util.*;
import java.io.*;
public class Maze{
    private char[][]maze;
    private boolean animate;//false by default

    /*Constructor loads a maze text file, and sets animate to false by default.

      1. The file contains a rectangular ascii maze, made with the following 4 characters:
      '#' - Walls - locations that cannot be moved onto
      ' ' - Empty Space - locations that can be moved onto
      'E' - the location of the goal (exactly 1 per file)
      'S' - the location of the start(exactly 1 per file)
      2. The maze has a border of '#' around the edges. So you don't have to check for out of bounds
      3. When the file is not found OR the file is invalid (not exactly 1 E and 1 S) then:
         throw a FileNotFoundException or IllegalStateException
    */

    public Maze(String filename) throws FileNotFoundException{
        //COMPLETE CONSTRUCTOR
        File text = new File(filename);
        Scanner s = new Scanner(text);
        int rows = 0;
        int cols = 0;
        while(s.hasNextLine()){
              String line = s.nextLine();
              cols = line.length();
              rows++;
          }
        maze = new char[rows][cols];
        s = new Scanner(text);
        int line = 0;
        while(s.hasNextLine()){
          String t = s.nextLine();
          for (int i = 0; i < cols ;i++ ) {
            maze[line][i] = t.charAt(i);
          }
          line++;
        }
        int sCount = 0;
        int eCount = 0;
        for (char[] a :maze) {
          for (char b : a) {
            if(b == 'E'){
              eCount++;
            }
            if(b == 'S'){
              sCount++;
            }
          }
        }
        if(sCount > 1 || eCount > 1){
          throw new IllegalStateException();
        }
        setAnimate(false);
    }
    public String toString(){
      String s = "";
      for (char[] a :maze) {
        for (char b : a) {
          s += b;
        }
        s += "\n";
      }
      return s;
    }
    private void wait(int millis){
         try {
             Thread.sleep(millis);
         }
         catch (InterruptedException e) {
         }
     }

    public void setAnimate(boolean b){

        animate = b;

    }

    public void clearTerminal(){

        //erase terminal, go to top left of screen.

        System.out.println("\033[2J\033[1;1H");

    }

    /*Wrapper Solve Function returns the helper function

      Note the helper function has the same name, but different parameters.
      Since the constructor exits when the file is not found or is missing an E or S, we can assume it exists.

    */
    public int solve(){

            //find the location of the S.

            //erase the S

            //and start solving at the location of the s.

            //return solve(???,???);
            return -1;
    }

    /*
      Recursive Solve function:

      A solved maze has a path marked with '@' from S to E.

      Returns the number of @ symbols from S to E when the maze is solved,
      Returns -1 when the maze has no solution.


      Postcondition:

        The S is replaced with '@' but the 'E' is not.

        All visited spots that were not part of the solution are changed to '.'

        All visited spots that are part of the solution are changed to '@'
    */

    private int solve(int row, int col){ //you can add more parameters since this is private


        //automatic animation! You are welcome.
        if(animate){

            clearTerminal();
            System.out.println(this);

            wait(20);
        }

        //COMPLETE SOLVE

        return -1; //so it compiles
    }
}
