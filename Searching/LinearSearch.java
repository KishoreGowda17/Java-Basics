package Searching;

public class LinearSearch {
    public static void linearSearch(int arr[], int key) {

        boolean found = false; // key not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index : " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        // int key = 40;

        linearSearch(array, 40);
        linearSearch(array, 50);
        linearSearch(array, 100);
    }
}
