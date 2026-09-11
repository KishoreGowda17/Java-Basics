package methods;

import java.util.Scanner;

public class CheckEvenOdd {

    static void checkOddEven(int x) {

        if (x % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

    }
    // static int oddEven(int x) {
    // if (x % 2 == 0) {
    // return 1;
    // } else {
    // return 0;
    // }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckEvenOdd obj = new CheckEvenOdd();
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        checkOddEven(num);

    }
}
