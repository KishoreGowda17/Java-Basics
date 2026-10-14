package ArrayPractice.IntegerArrayPractice;

public class CheckIncreasingOrder {
    public static boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 14};

        System.out.println(isIncreasing(nums));
    }
}