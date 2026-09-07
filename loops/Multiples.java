// package loops;

import java.util.*;

public class Multiples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print table : ");
        int num = sc.nextInt();

        // For loop

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(num + " X " + i + " = " + (i * num));
        // }

        int i = 1;
        // while loop

        // while (i <= 10) {
        // System.out.println(num + " X " + i + " = " + (i * num));
        // i++;
        // }

        // do while
        do {
            System.out.println(num + " X " + i + " = " + (i * num));
            i++;
        } while (i <= 10);
    }
}
