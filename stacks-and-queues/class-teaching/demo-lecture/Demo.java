import java.util.ArrayList;
import java.util.Stack;

public class Demo {
  public static void main(String[] args) {
    // ArrayList<Integer> q = new ArrayList<Integer>();
    // for (int i = 0; i < 10; i++) { q.add(0, i); }
    // while (q.size() > 0) {
    //   System.out.println(q.remove(q.size() - 1));
    // }

    ArrayList<Integer> myStack = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) { myStack.add(i); }
    while (myStack.size() > 0) {
      System.out.println(myStack.remove(myStack.size() - 1));
    }

    System.out.println("With java built-in class");
    Stack<Integer> myStack2 = new Stack<Integer>();
    for (int i = 0; i < 10; i++) { myStack2.push(i); }
    while (!myStack2.isEmpty()) {
      System.out.println(myStack2.pop());
    }
  }
}