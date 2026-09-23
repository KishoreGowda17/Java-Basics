public class AverageArray {

    double average(int a[]) {
        int sum = 0;

        for (int i : a) {
            sum = sum + i;
        }
        double average = (double) sum / a.length;

        return average;

    }

    public static void main(String[] args) {

        AverageArray obj = new AverageArray();

        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Average = " + obj.average(arr));

    }
}