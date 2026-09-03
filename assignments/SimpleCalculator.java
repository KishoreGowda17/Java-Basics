// package assignments;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Enter the number for the operation");
        System.out.println("1.Addition");

        System.out.println("2.Subtraction");

        System.out.println("3.Multiplication");

        System.out.println("4.Division");

        System.out.println("5.modulus");

        int caseNum = sc.nextInt();

        switch (caseNum) {
            case 1:
                System.out.println("Addition : "+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction : "+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication : "+(num1*num2));
                break;
            case 4:
                System.out.println("Division : "+(num1/num2));
                break;
            case 5:
                System.out.println("Modulus : "+(num1%num2));
                break;

            default:
                System.out.println("Invalid option");
                break;
        }

    }
}
