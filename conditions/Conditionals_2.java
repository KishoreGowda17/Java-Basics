package conditions;

import java.util.Scanner;

public class Conditionals_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Indian citizenship : True | False");
        boolean citizen = sc.nextBoolean();

        if (age >= 18) {
            if (citizen) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        } else{
            System.out.println("age is less than 18");
        }
    }
}
