/*
    Approach 2 : Build clean String using StringBuilder
    Reason : Avoid creating multiple String objects while cleaning
    TC : O(n)
    SC : O(n)
*/

public class IsPalindromeApproachTwo {

    public static void main(String[] args) {
        testPalindrome("madam");
        testPalindrome("racecar");
        testPalindrome("hello");
        testPalindrome("A man, a plan, a canal : Panama");
        testPalindrome("race a car");
        testPalindrome("121");
        testPalindrome("A1@b#b@1a");
        testPalindrome(" ");
    }

    public static void testPalindrome(String input) {
        boolean ans = isPalindrome(input);
        System.out.println("Input : " + input + " = " + ans);
    }

    public static boolean isPalindrome(String input) {

        input = input.toLowerCase();

        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isLetterOrDigit(currentChar)) {
                cleaned.append(currentChar);
            }
        }

        StringBuilder reversedBuilder = new StringBuilder(cleaned).reverse();

        return cleaned.toString().equals(reversedBuilder.toString());
    }
}