package methodAssignments;

import java.util.*;

public class MaxOfThree {
    int max(int x, int y, int z) {

        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }
    // static int max(int x, int y, int z) {

    // if (x > y && x > z) {
    // return x;
    // } else if (y > x && y > z) {
    // return y;
    // } else {
    // return z;
    // }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxOfThree obj = new MaxOfThree();
        System.out.println("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // int result = max(a, b, c);
        int result = obj.max(a, b, c);
        System.out.println("Maximum = " + result);

    }
}
