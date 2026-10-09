package sorting;

public class BubbleSort {
    public static void bubbleSort(int nums[]) {

        if (nums == null || nums.length == 0)
            return;
        if (nums.length == 1)
            return;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void printSortedArray(int nums[]) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int array[] = { 5, 4, 3, 2, 1 };
        // int array[] = { 5, 4, 19, 2, 3 };
        // int array[] = {10};
        // int array[] = null;
        // int array[] = {};
        int array[] = { -5, -4, -19, 2, 3, 0 };
        System.out.println("Before Sorting");
        printSortedArray(array);
        System.out.println("After Sorting");
        bubbleSort(array);
        printSortedArray(array);

    }
}
