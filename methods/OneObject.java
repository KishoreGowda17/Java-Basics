package methods;

public class OneObject {
    // 1.No args No return
    void greet() {
        System.out.println("Hello");
    }

    // 2.args No return
    void printSum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // 3. No args but return
    int getNum() {
        return 100;
    }

    // 4. args and return
    int Max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        OneObject obj = new OneObject();

        obj.greet();

        obj.printSum(10, 20);

        int num = obj.getNum();
        System.out.println(num);

        int c = obj.Max(10, 20);
        System.out.println(c);


    }

}
