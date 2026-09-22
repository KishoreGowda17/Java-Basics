package forEachLoops;

public class Max {

    static void findMax(int a[]) {
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max = " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 100,21,34,12,55,11,245};
        findMax(arr);

    }
}
