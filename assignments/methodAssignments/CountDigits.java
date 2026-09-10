package methodAssignments;

import java.util.Scanner;

public class CountDigits {
    int count(int x, int cnt) {
        while (x > 0) {
            x = x / 10;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountDigits obj = new CountDigits();
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int counter = 0;
        int result = obj.count(num, counter);
        System.out.println("The number has " + result + " digits");
    }

}
