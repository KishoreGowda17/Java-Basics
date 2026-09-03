package swap;

public class swapNumMulDiv {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("---------------");
        System.out.println("before Swap");
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("---------------");

        num1 = num1 * num2; // num1 = 200

        num2 = num1 / num2; // num2 = 10

        num1 = num1 / num2; // num1 = 20

        System.out.println("After Swap");
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }
}
