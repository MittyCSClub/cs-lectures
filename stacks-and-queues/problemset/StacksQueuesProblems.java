import java.io.*;
import java.util.*;

public class StacksQueuesProblems {
  public static void main(String[] args) throws FileNotFoundException, IOException {

    // Problem 1: Read from the file "problemone.txt" and print its contents
    // line-by-line in reverse order using a stack
    //
    Scanner sc = new Scanner(new File("problemone.txt"));
    while (sc.hasNextLine()) {
      String line = sc.nextLine(); // reads next line from file
    }
    System.out.println("Problem 1 Output\n----------------");
    // Write your output code here


    // Problem 2: Rolling average
    // While reading the file "problemtwo.txt," print the average of the
    // current number and the previous two numbers using a queue
    //
    sc = new Scanner(new File("problemtwo.txt"));
    while (sc.hasNextLine()) {
      line = sc.nextLine();
      // Write your code here
    }
  }
}

