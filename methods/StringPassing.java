package methods;

import java.util.Scanner;

public class StringPassing {
    static void welcome(String a) {
        System.out.println("Welcome " + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        welcome(name);
    }
}
