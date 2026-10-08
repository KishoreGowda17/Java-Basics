package ArrayPractice.IntegerArrayPractice;

//  [70, 85, 90, 55]
public class AverageMark {

    public static double calculateAverageMarks(int nums[]) {

        int sum = 0;
        int average = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        average = sum / nums.length;
        return average;
    }

    public static void main(String[] args) {
        int[] array = { 70, 85, 90, 55 };
        System.out.print("Average = ");
        System.out.println(calculateAverageMarks(array));

    }
}
