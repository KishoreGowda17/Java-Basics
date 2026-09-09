package methods;

public class InstanceMethod {
    // demo of instance method , create object and access
    int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        InstanceMethod m = new InstanceMethod();
        int c = m.max(10, 15);
        System.out.println(c);
    }
}
