// package loops;

import java.util.Scanner;

public class PrintNum{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number :");
          int num = sc.nextInt(); //54321
          int reverse = 0;

          while(num>0){
               int digit = num % 10; // 1 //
               reverse = reverse * 10 + digit; // 1
               num /= 10; //5432
               System.out.println(digit); //1
          }
          System.out.println(reverse);
     }
}