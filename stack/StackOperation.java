package cutm.stack;

import java.util.EmptyStackException;

public class StackOperation {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public StackOperation(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top == capacity - 1) {
            throw new StackOverflowError("Stack is full. Cannot push more elements.");
        }
        stack[++top] = value;
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    // Peek the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }

    // Clear the stack
    public void clear() {
        top = -1;
    }

    // Main method for testing the stack operations
    public static void main(String[] args) {
        StackOperation stack = new StackOperation(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // Output: 30
        System.out.println("Stack size: " + stack.size()); // Output: 3

        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Stack size after pop: " + stack.size()); // Output: 2

        stack.clear();
        System.out.println("Stack size after clear: " + stack.size()); // Output: 0
    }
}