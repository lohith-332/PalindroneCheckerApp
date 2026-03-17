// version 1.0
// author Abc

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize the string (optional)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both stack and queue
        for (char ch : normalized.toCharArray()) {
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO (enqueue)
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) vs pop (stack)
        while (!stack.isEmpty() && !queue.isEmpty()) {
            char fromStack = stack.pop();     // reverse order
            char fromQueue = queue.remove();  // original order

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}





