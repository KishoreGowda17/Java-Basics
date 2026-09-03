package swap;
public class swapNum {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before Swap");
        System.out.println("Num 1 : " + num1);
        System.out.println("Num 2 : " + num2);
        System.out.println("\n");
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swap");
        System.out.println("Num 1 : " + num1);
        System.out.println("Num 2 : " + num2);
    }
}
