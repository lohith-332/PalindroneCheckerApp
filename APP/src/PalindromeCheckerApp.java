// version 1.0
// author Abc
// useCase 1: Welcome page

public class PalindromeCheckerApp {

    public static void main(String[] args){
        String input = "madam";

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            // Compare characters from start and end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
            String original = "level";
            String reversed = "";

            // Loop: Iterating backwards
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed += original.charAt(i); // String Concatenation
            }

            // Comparison: Using .equals() for content
            if (original.equalsIgnoreCase(reversed)) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
    }
        }


