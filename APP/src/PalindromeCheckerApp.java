// version 1.0
// author Abc

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize the string (optional but recommended)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
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


