package ArrayPractice.IntegerArrayPractice;

import java.util.Arrays;

public class CompareNumbers {
    public static int[] compareNumbers(int nums[]) {
        int result[] = new int[nums.length];
        int index = 0;
        for (int x : nums) {
            if (x > 50 && x < 100) {
                result[index] = x;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int array[] = { 45, 67, 100, 52, 99, 120, 50 };

        System.out.println(Arrays.toString(compareNumbers(array)));
    }
}
