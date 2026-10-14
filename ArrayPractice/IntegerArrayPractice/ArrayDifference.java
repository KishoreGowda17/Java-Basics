package ArrayPractice.IntegerArrayPractice;

import java.util.Arrays;

public class ArrayDifference {
    public static int[] findDifference(int[] a, int[] b) {
        int[] result = new int[a.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            boolean found = false;

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[count] = a[i];
                count++;
            }
        }

        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 8, 10};
        int[] b = {4, 8, 12};

        System.out.println(Arrays.toString(findDifference(a, b)));
    }
}