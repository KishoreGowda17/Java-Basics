package TwoDArrays;

public class AdditionofMatrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        int sum[][] = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
