package ArrayPractice.IntegerArrayPractice;

public class ClosestToAverage {
    public static int closestToAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;
        int closest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - average) < Math.abs(closest - average)) {
                closest = arr[i];
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 9, 4, 15 };

        System.out.println(closestToAverage(arr));
    }

}
