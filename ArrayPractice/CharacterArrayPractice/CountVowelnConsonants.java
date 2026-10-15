package ArrayPractice.CharacterArrayPractice;

public class CountVowelnConsonants {
    public static int[] countChar(char str[]) {
        int vowels = 0;
        int consonants = 0;
        for (char ch : str) {
            if (ch == 'A' && ch == 'a' || ch == 'E' && ch == 'e' ||
                    ch == 'I' && ch == 'i' || ch == 'O' && ch == 'o' || ch == 'U' && ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        char arr[] = {'a', 'p', 'p', 'l', 'e'};
        countChar(arr);
    }
}