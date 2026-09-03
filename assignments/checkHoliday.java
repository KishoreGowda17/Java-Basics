// package assignments;

import java.util.Scanner;

public class checkHoliday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day : ");
        String day = sc.next();

        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("It's a Holiday !");
        } else {
            System.out.println("Not a Holiday !");
        }

    }
}
