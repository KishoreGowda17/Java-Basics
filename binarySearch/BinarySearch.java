package binarySearch;

public class BinarySearch {

    public static int binarySearch(int arr[], int target) {

        if (arr == null)
            return -1;
        if (arr.length == 0)
            return -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target)
                right = mid - 1;

            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int target = 190;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else
            System.out.println("Target " + target + " is at index " + result);
    }
}
