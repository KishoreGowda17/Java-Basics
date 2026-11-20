/*
best approach leetcode 125
Reason : only traversal is required no extra objects
TC : O(n)
SC : O(1)

*/

public class IsPalindromeApproachThree {
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
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            }

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
