package forEachLoops;

public class SearchElement {

    static boolean searchELement(int a[], int key) {

        for (int x : a) {
            if (x == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println(searchELement(arr, 30));
        System.out.println(searchELement(arr, 100));
    }
}
