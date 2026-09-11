package methods;

import java.util.Scanner;

public class InstanceNonVoid {

    boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InstanceNonVoid obj = new InstanceNonVoid();
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        boolean result = obj.isEven(num);
        // System.out.println(result);
        
        if (result == true) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
