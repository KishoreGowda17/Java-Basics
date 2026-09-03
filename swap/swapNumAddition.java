package swap;

public class swapNumAddition {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        System.out.println("---------------");
        System.out.println("before Swap");
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("---------------");

        num1 = num1 + num2; // num1 = 300

        num2 = num1 - num2; // num2 = 100

        num1 = num1 - num2; // 300 - 100

        System.out.println("After Swap");
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }
}
