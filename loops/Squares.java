package loops;

public class Squares {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double result = Math.pow(i, 2);
            System.out.println((int)result);
        }
    }
}