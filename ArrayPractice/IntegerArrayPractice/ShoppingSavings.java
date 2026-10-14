package ArrayPractice.IntegerArrayPractice;

public class ShoppingSavings {
    public static int calculateSavings(int[] shopA, int[] shopB) {
        int savings = 0;

        for (int i = 0; i < shopA.length; i++) {
            if (shopB[i] < shopA[i]) {
                savings += shopA[i] - shopB[i];
            }
        }

        return savings;
    }

    public static void main(String[] args) {
        int[] shopA = {100, 250, 80, 40};
        int[] shopB = {90, 260, 70, 45};

        System.out.println(calculateSavings(shopA, shopB));
    }
}