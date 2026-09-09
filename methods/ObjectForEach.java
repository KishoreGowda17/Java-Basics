package methods;

public class ObjectForEach {
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
        // creating object
        ObjectForEach obj1 = new ObjectForEach();

        // 1

        obj1.greet();

        // 2
        ObjectForEach obj2 = new ObjectForEach();
        obj2.printSum(10, 20);

        // 3
        ObjectForEach obj3 = new ObjectForEach();
        int num = obj3.getNum();
        System.out.println(num);

        // 4
        ObjectForEach obj4 = new ObjectForEach();
        int c = obj4.Max(10, 20);
        System.out.println(c);
    }

}
