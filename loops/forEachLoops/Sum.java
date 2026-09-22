package forEachLoops;

public class Sum {

    static int findSum(int a[]) {
        int sum = 0;
        for (int x : a) {
            // sum = sum + x;
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7 };
        int result = findSum(arr);
        System.out.println(result);
    }
}
