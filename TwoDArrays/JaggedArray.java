package TwoDArrays;

public class JaggedArray {
    public static void printTwoDArray(int nums[][]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printParticularRow(int nums[][], int rowNumber) {
        // for (int i = 0; i < nums.length; i++) {
        // if (rowNumber == i)
        // for (int j = 0; j < nums[0].length; j++) {
        // System.out.print(nums[i][j] + " ");
        // }
        // }
        if (nums == null)
            return;
        if (rowNumber < 0 || rowNumber >= nums[rowNumber].length) {
            System.out.println("Invalid Row Number");
            return;
        }
        for (int col = 0; col < nums[rowNumber - 1].length; col++) {
            System.out.print(nums[rowNumber - 1][col] + " ");
        }

    }

    public static void printParticularColumn(int nums[][], int colNumber) {
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums[0].length; j++) {
        // if (colNumber == j)
        // System.out.println(nums[i][j] + " ");
        // }
        // }
        // }
        int colIndex = colNumber - 1;
        int rowIndex = 0;
    }

    public static void main(String[] args) {

        int arr[][] = {
                { 11, 12, 13, 14, 15 },
                { 21, 22, 23, 24, 25 },
                { 31, 32, 33, 34, 35 },
                { 41, 42, 43, 44, 45 },
                { 51, 52, 53, 54, 55 }
        };
        // printTwoDArray(arr);
        System.out.println();
        System.out.println("Row Number : ");
        printParticularRow(arr, -1);
        System.out.println();
        System.out.println();
        System.out.println("Column Number : ");
        printParticularColumn(arr, 4);

    }
}
