package ArrayPractice.IntegerArrayPractice;

import java.util.Arrays;

public class ReplaceNegativeWithZero {
    public static int[] replaceNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {5, -3, 8, -1, 0};

        System.out.println(Arrays.toString(replaceNegative(nums)));
    }

    
}
