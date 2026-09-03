import java.util.*;

public class ArraysDemo {
    public static void main(String[] args) {
        // int arr[5]; wrong

        float arr1[] = new float[5];

        // System.out.println(arr1[0]);
        // System.out.println(arr1[1]);
        // System.out.println(arr1[2]);
        // System.out.println(arr1[3]);
        // System.out.println(arr1[4]);

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1));
        }

        int arr[] = { 10, 20, 30 };

        // System.out.println(arr);
        // System.out.println(Arrays.toString(arr));

    }
}