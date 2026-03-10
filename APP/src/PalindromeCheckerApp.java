// version 1.0
// author Abc
// useCase 1: Welcome page

public class PalindromeCheckerApp {

    public static void main(String[] args){

        String input = "radar";

        // Step 1: Convert String to char array
        char[] charArray = input.toCharArray();

        boolean isPalindrome = true;
        int left = 0;                    // Start pointer
        int right = charArray.length - 1; // End pointer

        // Step 2: Two-Pointer comparison
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
            left++;  // Move toward the middle
            right--; // Move toward the middle
        }

        System.out.println("Is palindrome: " + isPalindrome);
    }
}



