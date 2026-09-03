// package assignments;

import java.util.*;

public class ClgAdmission {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int marks = sc.nextInt();

        System.out.println("Have you passed the exam : True or False");
        String passedExam = sc.next();

        if (marks >= 85 && passedExam.equals("True")) {
            System.out.println("Eligible for admission");
        } else {
            System.out.println("Not eligible");
        }

    }

}
