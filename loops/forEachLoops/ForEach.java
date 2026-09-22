package forEachLoops;

public class ForEach {

    static void traverse(int a[]) {
        for (int x : a) {
            System.out.print(x + ",");
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
        traverse(arr);

        // traverse(new int[] { 1, 2, 3, 4 }); Anonymous array

    }

}
