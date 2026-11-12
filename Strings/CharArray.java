package Strings;

public class CharArray {
    public static void main(String[] args) {
        char arr[] = new char[5];
        System.out.println("Task 1");
        System.out.println("--------------------");

        for (char ch : arr) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Task 2");
        System.out.println("--------------------");

        char name[] = {'K', 'I', 'S', 'H', 'O', 'R', 'E'};
        for (char ch : name) {
            System.out.print(ch);
        }
        System.out.println();

        System.out.println("--------------------");
        System.out.println("Task 3");
        System.out.println("--------------------");

        char nameTwo[] = {'D', 'A', 'R', 'S', 'H'};
        int charArrayLength = nameTwo.length;
        System.out.println("The size of the char array is : " + charArrayLength);

        System.out.println("--------------------");
        System.out.println("Task 4");
        System.out.println("--------------------");

        char[] temp = {65, 66, 67, 68};
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();

        System.out.println("--------------------");
        System.out.println("Task 5");
        System.out.println("--------------------");

        char[] partial = new char[5];
        partial[0] = 'A';
        partial[1] = 'b';
        partial[2] = 'C';
        for (int i = 0; i < partial.length; i++) {
            System.out.print(partial[i] + " ");
        }
        System.out.println();

        System.out.println("--------------------");
        System.out.println("Task 6");
        System.out.println("--------------------");

        String myName = "Kishore";
        int strLen = myName.length();
        System.out.println("Length of the String " + myName + " is : " + strLen);

    }
}