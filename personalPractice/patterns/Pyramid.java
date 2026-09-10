package personalPractice.patterns;

public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                // Spaces
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                // spaces
                System.out.print("  ");

            }
            for (int k = 1; k <= 2 * n - 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
