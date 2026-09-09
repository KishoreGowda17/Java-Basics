package methods;

public class ReturnType {
    static int maxOfTwo(int x, int y) {
        System.out.println(x);
        if (x > y) {
            return x;
        } else {
            return y;
        }
        // System.out.println(a); a is not in this method/Scope
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int c = maxOfTwo(a, b);
        System.out.println("Greater number is : " + c);

    }
}
