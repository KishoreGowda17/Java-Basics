package assignments;

import java.util.*;

public class LargestOftTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd Number");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("1st Number is greater");
        } else {
            System.out.println("2nd Number is greater");
        }

    }
}
