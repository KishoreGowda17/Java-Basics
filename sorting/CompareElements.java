package sorting;

public class CompareElements {
    public static void compareElements(int nums[]) {
        if (nums == null || nums.length == 0)
            return;
        if (nums.length == 1)
            return;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j])
                    System.out.println(nums[i] + " > " + nums[j]);
                else if (nums[i] == nums[j])
                    System.out.println(nums[i] + " = " + nums[j]);
                else {
                    System.out.println(nums[i] + " < " + nums[j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int array[] = {10,20,30,40};

        compareElements(array);
    }
}
