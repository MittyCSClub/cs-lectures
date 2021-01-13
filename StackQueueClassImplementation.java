import java.util.ArrayList;

class ArrayStack<T> { // generic types
  private ArrayList<T> _arr;

  ArrayStack() { this._arr = new ArrayList<T>(); }

  void push(T val) { this._arr.add(val); }
  T pop() {
    return this._arr.remove(this._arr.size() - 1);
  }

  void clear() {
    while (this._arr.size() > 0) {
      System.out.println(this.pop());
    }
  }
}

class ArrayQueue<T> {
  private ArrayList<T> _arr;

  ArrayQueue() { this._arr = new ArrayList<T>(); }

  // inefficient, requires resizing array every time
  void add(T val) { this._arr.add(0, val); }
  T remove() {
    return this._arr.remove(this._arr.size() - 1);
  }

  void clear() {
    while (this._arr.size() > 0) {
      System.out.println(this.remove());
    }
  }
}

public class StackQueueClassImplementation {
  public static void main(String[] args) {

    // Naive method: Stacks/Queues using ArrayList (inefficient)

    // Stack implementation: ArrayList
    System.out.println("Stack with ArrayList implementation of Deque interface");
    ArrayStack<Integer> arrStack = new ArrayStack<Integer>();
    for (int i = 0; i < 10; i++)  arrStack.push(i);
    arrStack.clear();
    System.out.println();

    
    // Queue implementation: ArrayList
    System.out.println("Queue with ArrayList implementation of Deque interface");
    ArrayQueue<Integer> arrQ = new ArrayQueue<Integer>();
    for (int i = 0; i < 10; i++) arrQ.add(i);
    arrQ.clear();
    System.out.println();
  }
}
