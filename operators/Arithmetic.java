package operators;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;

        System.out.println();

        System.out.println("addition : " + (a + b));
        System.out.println("subtraction : " + (a - b));
        System.out.println("multiplication : " + (a * b));
        System.out.println("division : " + (a / b));
        System.out.println("modulus : " + (a % b));

        System.out.println("Increment : " + (++a));
        System.out.println("Decrement : " + (--b));

        boolean x = true;
        boolean y = false;
        // System.out.println(x+y); error in java cause it doesn't take the boolean as 1
        // and 0

        // integer and float

        int a1 = 10;
        float b1 = 20.4f;
        System.out.println();
        System.out.println("addition : " + (a1 + b1));
        System.out.println("subtraction : " + (a1 - b1));
        System.out.println("multiplication : " + (a1 * b1));
        System.out.println("division : " + (a1 / b1));
        System.out.println("modulus : " + (a1 % b1));

        System.out.println("Increment : " + (++a1));
        System.out.println("Decrement : " + (--b1));
    }
}
