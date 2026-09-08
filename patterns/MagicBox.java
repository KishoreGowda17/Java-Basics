package patterns;

import java.util.*;

public class MagicBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // System.out.printf("%2d", " ", i + j);
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }
}
