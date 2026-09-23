package questions;

public class CountKey {

    static int countKey(int key, int... arr) {
        int count = 0;
        for (int i : arr) {
            if (i == key) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int key = 20;
        System.out.println(key + " has occured " + countKey(key, 20, 10, 20, 30, 20, 40, 20) + " times");
    }
}
