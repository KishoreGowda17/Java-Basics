package ArrayPractice.CharacterArrayPractice;

import java.util.Arrays;

public class convertToUpperCase {
    static char[] convert(char str[]) {

        char result[] = new char[str.length];

        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'a' && str[i] <= 'z') {
                result[i] = (char) (str[i] - 32);
            } else {
                result[i] = str[i];
            }
        }

        return result;
    }

    static void main() {
        char array[] = {'c', 'o', 'd', 'e'};

        System.out.println((convert(array)));

    }
}
