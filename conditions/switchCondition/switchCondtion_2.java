package conditions.switchCondition;

import java.util.*;

public class switchCondtion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        String result = (age>=18)? "YES" : "NO";

        switch (result) {
            case "YES":
                System.out.println("Eligible to vote");
                break;
            case "NO":
                System.out.println("Not Eligible");
                break;
            default:
                System.out.println("Invalid age");
                break;
        }

    }
}
