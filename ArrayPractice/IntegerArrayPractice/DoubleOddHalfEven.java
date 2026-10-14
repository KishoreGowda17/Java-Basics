package ArrayPractice.IntegerArrayPractice;

import java.util.*;

public class DoubleOddHalfEven {
    public static int[] transformArray(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[i] = arr[i] / 2;
            } else {
                result[i] = arr[i] * 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 10, 3 };

        System.out.println(Arrays.toString(transformArray(arr)));
    }
}