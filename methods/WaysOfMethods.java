package methods;

public class WaysOfMethods {
    // 1.No args No return
    static void greet() {
        System.out.println("Hello");
    }

    // 2.args No return
    static void printSum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // 3. No args but return
    static int getNum() {
        return 100;
    }

    // 4. args and return
    static int Max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {

        // 1
        greet();

        // 2
        printSum(10, 20);

        // 3
        int num = getNum();
        System.out.println("Number is " + num);

        // 4
        int a = 10;
        int b = 20;
        int c = Max(a, b);
        System.out.println(c + " is greater");
    }
}
