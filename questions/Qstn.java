package questions;
public class Qstn {

    static int evenCount(int... nums) {
        int count = 0;

        for (int i : nums) {
            if (i % 2 == 0)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(evenCount(10, 15, 20, 25, 30));
    }

}
