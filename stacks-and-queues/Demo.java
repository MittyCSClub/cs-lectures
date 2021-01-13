import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

public class Demo {
  public static void main(String[] args) {

    /*
      Naive method: Stacks/Queues using ArrayList (inefficient)
    */

    // Stack implementation: ArrayList
    System.out.println("Stack with ArrayList implementation of Deque interface");
    ArrayList<Integer> arrayListStack = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) arrayListStack.add(i); // append (push to top of stack)
    while (arrayListStack.size() > 0) { // empty (pop last element of stack)
      System.out.println(arrayListStack.remove(arrayListStack.size() - 1));
    }
    System.out.println();

    
    // Queue implementation: ArrayList
    //    Inefficient: adding an element requires shifting the whole array
    System.out.println("Queue with ArrayList implementation of Deque interface");
    ArrayList<Integer> arrayListQ = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) arrayListQ.add(0, i); // add (add to back of queue)
    while (arrayListQ.size() > 0) { // empty (remove from front of queue)
      System.out.println(arrayListQ.remove(arrayListQ.size() - 1));
    }
    System.out.println();


    /*
      Less naive method: Stacks using built-in Java class (less inefficient)
    */

    // Stack implementation: Built in Java class
    System.out.println("Stack with built-in class");
    Stack<Integer> myStack = new Stack<Integer>(); // type is an object
    for (int i = 0; i < 10; i++) myStack.push(i); // push to top
    while (!myStack.isEmpty()) System.out.println(myStack.pop()); // pop from top
    System.out.println();


    /*
      Less naive method: Using the Deque interface and ArrayDeque class
      for stacks and queues (more efficient for Java reasons)
    */

    // Stack implementation: ArrayDeque
    //    Note how the deque operations are named same as the stack operations
    //    They implement the same interface
    System.out.println("Stack with ArrayDeque implementation of Deque interface");
    ArrayDeque<Integer> dequeStack = new ArrayDeque<Integer>();
    for (int i = 0; i < 10; i++) dequeStack.push(i); // push to top
    while (!dequeStack.isEmpty()) System.out.println(dequeStack.pop()); // pop from top, can also use remove()
    System.out.println();


    // Queue Implementation: ArrayDeque 
    //    Doesn't exist as a class in Java (only an interface)
    System.out.println("Queue with ArrayDeque implementation of Deque interface");
    ArrayDeque<Integer> dequeQ = new ArrayDeque<Integer>();
    for (int i = 0; i < 10; i++) dequeQ.add(i); // add to the back
    while (!dequeQ.isEmpty()) System.out.println(dequeQ.remove()); // remove from front, can also use pop()
    System.out.println();
  }
}
