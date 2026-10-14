package ArrayPractice.IntegerArrayPractice;

public class CountDivisible {
    public static int countDivisible(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 15, 9, 30, 10, 45, 7 };

        System.out.println(countDivisible(arr));
    }
}