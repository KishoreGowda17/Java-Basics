package TwoDArrays;

public class BoundaryElement {
    public static void printBoundaryElements(int nums[][]) {

        if (nums == null)
            return;

        if (nums.length == 0)
            return;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {

                if (i == 0 || i == nums.length - 1 || j == 0 || j == nums[0].length - 1) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int a[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 8, 1 } };
        printBoundaryElements(a);

    }
}
