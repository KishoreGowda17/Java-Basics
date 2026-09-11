package methods;

public class ReturnArray {
    static int[] update() {
        int a[] = { 10, 20, 30, 40 };
        return a;
    }

    public static void main(String[] args) {
        int b[] = update();
        System.out.println("Before Updation");
        // System.out.println(b[0] + " " + b[1] + " " + b[2] + " " + b[3]);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        b[0] = 100;
        System.out.println();

        System.out.println("After updation");
        // System.out.println(b[0] + " " + b[1] + " " + b[2] + " " + b[3]);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }

    }
}
