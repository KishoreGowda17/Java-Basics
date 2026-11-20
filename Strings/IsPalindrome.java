// leetcode 125 : valid palindrome
// Approch 1  : Reverse a String
// class used : StringBuilder
// reason : StringBuilder provides reverse() method
// easy to understand logic
// good starting approch
// Time complexity : O(n)
// Space complexity : O(n)

public class IsPalindrome {

    public static void main(String[] args) {
        testPalindrome("madam");
        testPalindrome("racecar");
        testPalindrome("hello");
        testPalindrome("A man, a plan, a canal : Panama");
        testPalindrome("race a car");
        testPalindrome("121");
        testPalindrome("a@1@1a");
        testPalindrome(" ");
    }

    // testing
    public static void testPalindrome(String input) {
        boolean ans = isPalindrome(input);

        System.out.println("Input : " + ans);

    }

    // Write logic here
    // return true if palindrome
    public static boolean isPalindrome(String input) {

        // Step 1 : convert everything to lowerCase
        // bcaz --> A and a should be treated same

        input = input.toLowerCase();

        // Step 2 : keep only letter and digits
        // ignore space , spl chars

        String cleaned = "";

        for (int i = 0; i < input.length(); i++) {
            char currentCharter = input.charAt(i);
            if (Character.isLetterOrDigit(currentCharter)) { // Character is inBuilt class that has isLetterOrDigit
                cleaned = cleaned + currentCharter;
            }
        }

        // Step 3 : Reverse the cleaned String

        StringBuilder builder = new StringBuilder(cleaned);
        String reversed = builder.reverse().toString();

        // step 4 : compare

        return cleaned.equals(reversed);
    }

}
