package methods;

public class MethodOverloading {
    int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    float max(float x, float y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.max(10, 20));
        System.out.println(obj.max(10.2f, 20.3f));
    }
}
