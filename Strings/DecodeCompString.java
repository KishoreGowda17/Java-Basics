/*
decode compressed string
input : a3b4c2
output : aaabbbbcc
assumption : every char is followed by single digit
Use String builder : bcaz size we dont know
TC : 
SC : 

Parsing : Converting from one format to other 
and StringBuilder

*/

public class DecodeCompString {

    public static void main(String[] args) {
        // testDecode("a3b4c2");
        // testDecode("x1y5");
        // testDecode("m2n3");
        testDecode("a12");
    }

    public static void testDecode(String input) {

        System.out.println("Input : " + input + " = " + decode(input));
    }

    public static String decode(String input) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < input.length(); i = i + 2) {
            // Read Chars

            char currentChar = input.charAt(i);

            // read digit
            int number = input.charAt(i + 1) - '0';
            // 

            for (int count = 1; count <= number; count++) {
                answer.append(currentChar);
            }
        }

        return answer.toString();

    }
}
