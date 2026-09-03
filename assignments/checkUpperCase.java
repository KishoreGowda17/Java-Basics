// package assignments;

import java.util.*;

public class checkUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Letter");
        char a = sc.next().charAt(0);

        if (Character.isUpperCase(a)) {
            System.out.println("It is a Upper Case letter");
        } else {
            System.out.println("It is a lower Case letter");

        }
    }
}
