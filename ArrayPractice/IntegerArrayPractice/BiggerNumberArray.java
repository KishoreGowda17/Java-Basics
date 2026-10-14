package ArrayPractice.IntegerArrayPractice;

import java.util.Arrays;

public class BiggerNumberArray {
    public static int[] findBigger(int[] a, int[] b) {
        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = Math.max(a[i], b[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {4, 9, 2, 7};
        int[] b = {6, 3, 8, 1};

        System.out.println(Arrays.toString(findBigger(a, b)));
    }
}