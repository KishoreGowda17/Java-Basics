package ArrayPractice.IntegerArrayPractice;

public class SumOfNumbersEvenIndex {
    public static int calculateSum(int nums[]) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int array[] = { 10, 3, 20, 7, 30, 2 ,10};

        System.out.println("Sum of even indices : " + calculateSum(array));
    }
}