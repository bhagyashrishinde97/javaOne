package Collection;

import java.util.Stack;

public class Methodstack {

        public static void main(String[] args) {
            // Creating a Stack of Integers
            Stack<Integer> stack = new Stack<>();

            // Pushing elements onto the Stack
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);

            System.out.println("Stack: " + stack);

            // Peek at the top element
            System.out.println("Top element (peek): " + stack.peek());

            // Pop an element (removes the top)
            System.out.println("Popped element: " + stack.pop());

            // Stack after pop
            System.out.println("Stack after pop: " + stack);

            // Search for an element
            int position = stack.search(20);
            System.out.println("Position of 20 in stack: " + position);

            // Checking if the stack is empty
            System.out.println("Is stack empty? " + stack.isEmpty());
        }
    }


