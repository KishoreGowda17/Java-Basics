package ArrayPractice.IntegerArrayPractice;

public class ShoppingCartDiscount {
    public static double calculateAmount(int[] prices) {
        int total = 0;

        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }

        if (total > 1000) {
            return total * 0.90;
        }

        return total;
    }

    public static void main(String[] args) {
        int[] prices = {400, 350, 450};

        System.out.println(calculateAmount(prices));
    }
}