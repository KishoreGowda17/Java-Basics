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

    public static void printParticularRowV1(int nums[][], int rowNumber) {
        for (int i = 0; i < nums.length; i++) {
            if (rowNumber == i)
                for (int j = 0; j < nums[0].length; j++) {
                    System.out.print(nums[i][j] + " ");
                }
        }
    }

    public static void printParticularRowV2(int nums[][], int rowNumber) {
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

    public static void printParticularColumnV1(int nums[][], int colNumber) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (colNumber == j)
                    System.out.println(nums[i][j] + " ");
            }
        }
    }

    public static void printParticularColumnV2(int nums[][], int colNumber) {
        int colIndex = colNumber - 1;
        if (nums == null)
            return;

        for (int row = 0; row < nums.length; row++) {
            if (nums[row].length < colIndex) {
                System.out.println("Less colums in this row");
                continue;
            }
            System.out.println(nums[row][colNumber] + " ");
        }

    }

    // public static void printDiagonal(int nums[][], int rowNumber, int colNumber) {
    //     int rowIndex = rowNumber - 1;
    //     int colIndex = colNumber - 1;

    //     for (rowIndex ; rowIndex < nums.length; rowIndex++) {
            
    //     }
    // }

    public static void main(String[] args) {

        int arr[][] = {
                { 11, 12, 13, 14, 15 },
                { 21, 22, 23, 24, 25 },
                { 31, 32, 33, 34, 35 },
                { 41 },
                { 51, 52, 53, 54, 55 }
        };
        // printTwoDArray(arr);
        System.out.println();
        System.out.println("Row Number : ");
        printParticularRowV2(arr, 1);
        System.out.println();
        System.out.println();
        System.out.println("Column Number : ");
        printParticularColumnV2(arr, 3);

    }
}
