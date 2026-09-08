public class printOddandEven {
    public static void main(String[] args) {

        int n = 10;
        for (int i = 1; i <= n; i++) {
            // for even Numbers
            if (i % 2 != 0)
                continue;

            // for Odd numbers
            // if(i%2==0)
            // continue;
            System.out.println(i);
        }
    }
}
