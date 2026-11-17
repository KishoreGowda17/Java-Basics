public class CountSpecialChar {
    public static int getCount(char[] input) {
        int count = 0;
        for (char ch : input) {
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch == ' '))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[] input = { 'a', '#', '9', 'i', '&', '0', 'T', '-' };

        int res = getCount(input);

        System.out.println("Number of Special character in the input is  : " + res);
    }
}
