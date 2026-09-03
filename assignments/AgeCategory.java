// package assignments;

import java.util.*;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        if (age > 0 && age <= 12) {
            System.out.println("You are a Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager");
        } else if(age > 19 && age < 60){
            System.out.println("You are an Adult");
        } else if(age >= 60){
            System.out.println("You are a Senior Citizen");
        }
    }
}
