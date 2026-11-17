// package Strings;

public class FindLargestChar {

    public static char findLargestChar(char[] chars) {
        if (chars == null || chars.length == 0) {
            throw new IllegalArgumentException("chars must not be null or empty");
        }

        char largest = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] > largest) {
                largest = chars[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        char name[] = {'K', 'I', 'S', 'H', 'O', 'R', 'E'};
        char result = findLargestChar(name);
        System.out.println("Largest character is: " + result);
    }
}
