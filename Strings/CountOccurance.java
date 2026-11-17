public class CountOccurance {

    public static int countOccurrence(char[] characters, char target) {
        int count = 0;
        for (char character : characters) {
            if (character == target) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'a', 'c', 'a'};
        char target = 'a';
        System.out.println(countOccurrence(characters, target));
    }
}
