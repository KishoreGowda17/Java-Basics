package ArrayPractice.IntegerArrayPractice;

public class SumFirstAndLast {
    public static int findSum(int[] arr) {
        return arr[0] + arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {7, 3, 9, 4};

        System.out.println(findSum(nums));
    }
}