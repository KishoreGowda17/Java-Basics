package loops;

import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter End");
        int end = sc.nextInt();

        for (int i = 1; i <= end; i = i * 2) {
            System.out.println(i);
        }

    }

}
