package ArrayPractice;

public class BackTraversal {

    static int countEven(int nums[]) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array is Empty");
            return -1;
        }
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    static int firstNegativeFromRight(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array is Empty");
            return -1;
        }

        for (int i = nums.length - 1; i >= -1; i--) {
            if (nums[i] < 0)
                return nums[i];
        }
        return -1;
    }

    static int lastPositiveNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array is Empty");
            return -1;
        }

        for (int i = nums.length - 1; i >= -1; i--) {
            if (nums[i] > 0)
                return nums[i];
        }
        return -1;
    }

    static int[] printelementsgreaterthanelemnt(int nums[], int val) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array is Empty");
            return nums;
        }
        int result[] = new int[nums.length];
        int index = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > val) {
                result[index] = val;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // System.out.println(countEven(new int[] { 1, 4, 5, 6, 12, 45, 64, 22 }));
        // System.out.println(firstNegativeFromRight(new int[] { 1, 4, 5, 6, 12, 45, 64,
        // -10 }));
        // System.out.println(lastPositiveNumber(new int[] { 1, 4, 5, 6, 12, 45, 64, -10
        // }));
        System.out.println(printelementsgreaterthanelemnt((new int[] { 1, 4, 5, 6, 12, 45, }), 4));
    }
}
