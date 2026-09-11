package methods;

public class PassByObject {

    static void update(int x[]) {

        x[0] = 100;
        System.out.println("Inside Method = " + x[0]);// 100

    }

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40 };
        System.out.println("Before Method Call = " + a[0]); // 10
        update(a);
        System.out.println("After Method Call = " + a[0]);// 100

    }
}
