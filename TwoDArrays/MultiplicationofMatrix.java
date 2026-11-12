package TwoDArrays;

public class MultiplicationofMatrix {
    static int[][] matrixMultiply(int a[][], int b[][]) {
        int[][] result = new int[a.length][b[0].length];
        if (a == null || b == null)
            return result;

        if (a.length == 0 || b.length == 0)
            return result;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int k = 0; k < b[i].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 8, 1 } };
        int b[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

        int result[][] = matrixMultiply(a, b);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
