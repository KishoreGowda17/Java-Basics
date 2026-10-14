package ArrayPractice.IntegerArrayPractice;

public class CountPalindromes {
    public static int countPalindromes(int[] arr) {
        int count = 0;

        for (int num : arr) {
            int original = num;
            int reverse = 0;

            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }

            if (original == reverse) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {121, 45, 7, 1331, 80};

        System.out.println(countPalindromes(nums));
    }
}