package sorting;

public class SelectionSort {
    static void sorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 9, 2, 16, 6, 13 };

        System.out.println("Before Swapping");
        printArray(array);

        System.out.println("After Swapping");
        sorting(array);
        printArray(array);


    }
}
