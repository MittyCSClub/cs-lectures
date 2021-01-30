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
    Stack<String> s = new Stack<String>();

    while (sc.hasNextLine()) {
      String line = sc.nextLine(); // reads next line from file
      s.push(line);
    }
    System.out.println("Problem 1 Output\n----------------\n");
    // Write your code here
    while (!s.isEmpty()) {
      System.out.println(s.pop());
    }
  }

  public static void problem2() throws FileNotFoundException, IOException {
    // Write your solution here
    System.out.println("Problem 2 Output\n----------------\n");
    Scanner sc = new Scanner(new File("problemtwo.txt"));
    ArrayList<Integer> q = new ArrayList<Integer>();

    while (sc.hasNextLine()) {
      int line = Integer.parseInt(sc.nextLine()); // reads next line from file
      q.add(0, line);
      if (q.size() >= 3) {
        int sum = 0;
        for (int i = 0; i < 3; i++) sum += q.get(i);
        System.out.println(sum/3.0);
        q.remove(q.size() - 1);
      }
    }
  }
}