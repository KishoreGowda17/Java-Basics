package ArrayPractice.IntegerArrayPractice;

public class AverageOfArrays {
    public static double[] calculateAverages(
            int[] a, int[] b, int[] c) {

        return new double[] {
            calculateAverage(a),
            calculateAverage(b),
            calculateAverage(c)
        };
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {5, 15};
        int[] c = {8, 8, 8, 8};

        double[] result = calculateAverages(a, b, c);

        System.out.println(java.util.Arrays.toString(result));
    }
}