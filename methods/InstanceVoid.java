package methods;

import java.util.Scanner;

public class InstanceVoid {

    void CheckEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InstanceVoid obj = new InstanceVoid();
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        obj.CheckEven(num);
    }
}