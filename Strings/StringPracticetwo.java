package Strings;

public class StringPracticetwo {
    public static void main(String[] args) {
        char[] temp = { 'A', 'B' };
        // System.out.println(temp);

        String name = "Java";
        // System.out.println(name);

        int[] nums = { 1, 2, 3 };
        // System.out.println(nums);

        String emoji = "(●'◡'●)";

        // System.out.println(emoji.length());

        // char ch = 'A';
        // System.out.println(((char) (ch + 1)));

        // char ch_ = 'B';
        // System.out.println(((char) (ch_ - 1)));

        // caps to small
        // char ch = 'A';
        // System.out.println((char) (ch + 32));

        // Small to Caps
        // char ch_ = 'a';
        // System.out.println((char) (ch_ - 32));

        // char ch = 'G';

        // if (ch >= 'A' && ch <= 'Z') {
        // System.out.println(ch + " UpperCase ");
        // } else {
        // System.out.println(ch + " LowerCase ");
        // }

        // char j[] = { 'J', 'A', 'V', 'A' };

        // for (int i = 0; i < j.length; i++) {
        // if (i % 2 == 0) {
        // System.out.print(j[i] + " ");
        // }
        // }

        // String j = "Java";

        // for (int i = 0; i < j.length(); i++) {
        // if (i % 2 == 0) {
        // System.out.print(j.charAt(i) + " ");
        // }
        // }

        // char[] temp_ = { 'J', 'A', 'V', 'A' };

        // if (temp_.length % 2 == 1) {
        //     System.out.println("Middle : " + temp_[temp_.length / 2]);
        // } else {
        //     System.out.println("Two middle : " + temp_[temp_.length / 2 - 1] + temp_[temp_.length / 2]);
        // }

        String nam = "Java";

        if(nam.length() % 2 == 1 ){
            System.out.println("Middle : "+name.charAt());
        }
    }
}
