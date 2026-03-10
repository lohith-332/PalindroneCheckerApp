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
        }
    }
}

