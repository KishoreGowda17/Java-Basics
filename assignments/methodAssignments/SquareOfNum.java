package methodAssignments;

import java.util.Scanner;

public class SquareOfNum {
    // static int square(int a) {
    // return a * a;
    // }
    int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SquareOfNum obj = new SquareOfNum();

        System.out.println("Enter a number : ");
        int i = sc.nextInt();

        int output = obj.square(i);
        System.out.println(output);

    }
}
