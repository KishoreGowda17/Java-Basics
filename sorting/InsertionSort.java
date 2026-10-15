package sorting;

public class InsertionSort {
    public static void sorting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int nums[]) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {9, 2, 16, 6, 13};
        System.out.println("Before Sorting");
        printArray(array);

        System.out.println("After Sorting");
        sorting(array);
        printArray(array);
    }
}
