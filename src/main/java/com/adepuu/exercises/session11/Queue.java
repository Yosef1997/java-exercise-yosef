package com.adepuu.exercises.session11;

import java.util.LinkedList;

public class Queue {
  /**
   * Write a Java queue program that can scale dynamically
   * <p>
   * As a developer, I want to implement a Java queue program that can scale dynamically using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
   * <p>
   * Notes:
   * The program doesn't require a menu system; focus should be on data structure implementation.
   * <p>
   * Acceptance Criteria:
   * - Functionality: The program must be able to perform basic queue operations (enqueue, dequeue, peek) on a linked list.
   * - Dynamic Scaling: The queue should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
   * - Performance: The program should maintain constant time complexity for enqueue and dequeue operations, ensuring efficient data management.
   * - Memory Efficiency: The queue should use memory efficiently, allocating and deallocating memory dynamically as needed.
   * - Error Handling: The program should handle edge cases gracefully, such as attempting to dequeue an element from an empty queue, and provide clear error messages.
   */

  private LinkedList<Integer> queue;

  public Queue() {
    this.queue = new LinkedList<>();
  }

  public void enqueue(int val) {
    queue.addLast(val);
    System.out.println("Queue add: " + queue);
  }

  public void dequeue() {
    if (queue.isEmpty()) {
      System.out.println("Stack is empty");
    }else {
      int result = queue.removeFirst();
      System.out.println("Removed top element: " + result);
    }
  }

  public  void peek() {
    if (queue.isEmpty()){
      System.out.println("Stack is empty");
    } else {
      int result = queue.getFirst();
      System.out.println("Top element: " + result);
    }
  }

  public static void main(String[] args) {
    Queue queue = new Queue();

    queue.dequeue();
    queue.peek();

    queue.enqueue(10);
    queue.enqueue(15);
    queue.enqueue(30);
    queue.enqueue(20);
    queue.enqueue(10);

    queue.dequeue();
    queue.peek();
  }
}
