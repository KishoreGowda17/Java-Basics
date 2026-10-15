
package ArrayPractice;

import java.util.Arrays;

public class moveZeroEnd {

    public static int[] moveZeroToEnd(int nums[]) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        System.out.println(Arrays.toString(moveZeroToEnd(arr)));
    }
}
