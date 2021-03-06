import java.io.*;
import java.util.*;

public class StacksQueuesProblems {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    // Problem 1: Reverse
    // Read from the file "problemone.txt" and print its contents
    // line-by-line in reverse order using a stack
    problem1();

    // Problem 2: Rolling Average
    // While reading the file "problemtwo.txt" print the average of the
    // current number and the previous two numbers using a queue
    problem2();
  }

  public static void problem1() throws FileNotFoundException, IOException {
    // Write your solution here
    Scanner sc = new Scanner(new File("problemone.txt"));

    while (sc.hasNextLine()) {
      String line = sc.nextLine(); // reads next line from file
    }
    System.out.println("Problem 1 Output\n----------------");
  }

  public static void problem2() throws FileNotFoundException, IOException {
    // Write your solution here
    System.out.println("Problem 2 Output\n----------------");
    Scanner sc = new Scanner(new File("problemtwo.txt"));

    while (sc.hasNextLine()) {
      int line = Integer.parseInt(sc.nextLine()); // reads next line from file
    }
  }
}