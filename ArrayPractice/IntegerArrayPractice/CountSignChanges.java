package ArrayPractice.IntegerArrayPractice;

public class CountSignChanges {
    public static int countChanges(int[] arr) {
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i - 1] > 0 && arr[i] < 0) ||
                (arr[i - 1] < 0 && arr[i] > 0)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, -2, -5, 4, 6, -1};

        System.out.println(countChanges(nums));
    }
}