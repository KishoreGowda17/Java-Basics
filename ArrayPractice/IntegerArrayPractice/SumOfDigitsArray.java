package ArrayPractice.IntegerArrayPractice;

import java.util.Arrays;

public class SumOfDigitsArray {
    public static int[] digitSums(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {123, 45, 9};

        System.out.println(Arrays.toString(digitSums(nums)));
    }
}