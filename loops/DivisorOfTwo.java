// package loops;

import java.util.Scanner;

public class DivisorOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter end");
        int end = sc.nextInt();

        for (int i = 64; i >= end; i = i / 2) {
            System.out.println(i);
        }
    }
}
