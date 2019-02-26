import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Reader{
  public static void main(String[] args) throws FileNotFoundException{
    char[][] maze;
    File text = new File("Mazel.txt");
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
        line++;
      }
    }
    for (char[] row: maze) {
      for (char c: row) {
        System.out.print(c);
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
