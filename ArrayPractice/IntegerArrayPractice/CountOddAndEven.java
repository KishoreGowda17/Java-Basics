package ArrayPractice.IntegerArrayPractice;

import java.util.*;

public class CountOddAndEven {

    public static int[] countOddEven(int nums[]) {

        int odd = 0;
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return new int[] { odd, even };
    }

    public static void main(String[] args) {

        int[] array = { 3, 8, 5, 12, 7 };

        System.out.println("Number of odd and Even are : ");
        System.out.println(Arrays.toString(countOddEven(array)));
    }
}
