package ArrayPractice.IntegerArrayPractice;

public class CountStepsAndBestDay {
    public static int[] findSteps(int[] arr) {
        int count = 0;
        int best = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10000) {
                count++;
            }

            if (arr[i] > best) {
                best = arr[i];
            }
        }

        return new int[] {count, best};
    }

    public static void main(String[] args) {
        int[] steps = {8000, 12000, 10500, 9000, 15000};

        int[] result = findSteps(steps);

        System.out.println(java.util.Arrays.toString(result));
    }

}
