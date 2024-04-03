package com.adepuu.exercises.session11;

import java.util.LinkedList;

public class Stack {
  /**
   * Write a Java stack program that can scale dynamically
   * <p>
   * As a developer, I want to implement a Java stack program that can scale dynamically using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
   * Notes:
   * The program doesn't require a menu system; focus should be on data structure implementation.
   * <p>
   * Acceptance Criteria:
   * - Functionality: The program must be able to perform basic stack operations (push, pop, peek) on a linked list.
   * - Dynamic Scaling: The stack should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
   * - Performance: The program should maintain constant time complexity for push and pop operations, ensuring efficient data management.
   * - Memory Efficiency: The stack should use memory efficiently, allocating and deallocating memory dynamically as needed.
   * - Error Handling: The program should handle edge cases gracefully, such as attempting to pop an element from an empty stack, and provide clear error messages.
   */


  private LinkedList<Integer> stack;

  public Stack() {
    this.stack = new LinkedList<>();
  }

  public void push(int val) {
    stack.addLast(val);
    System.out.println("Stack add: " + stack);
  }

  public void pop() {
      if (stack.isEmpty()) {
          System.out.println("Stack is empty");
      }else {
          int result = stack.removeLast();
          System.out.println("Removed top element: " + result);
      }
  }

  public void peek() {
      if (stack.isEmpty()){
          System.out.println("Stack is empty");
      } else {
          int result = stack.getLast();
          System.out.println("Top element: " + result);
      }
  }

  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.pop();
    stack.peek();

    stack.push(10);
    stack.push(15);
    stack.push(30);
    stack.push(20);
    stack.push(10);

    stack.pop();
    stack.peek();
  }
}