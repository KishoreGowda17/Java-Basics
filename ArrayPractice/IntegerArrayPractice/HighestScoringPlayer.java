package ArrayPractice.IntegerArrayPractice;

public class HighestScoringPlayer {
    public static int findWinner(int[] p1, int[] p2, int[] p3) {
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        for (int i = 0; i < p1.length; i++) {
            total1 += p1[i];
            total2 += p2[i];
            total3 += p3[i];
        }

        if (total1 >= total2 && total1 >= total3) {
            return 1;
        } else if (total2 >= total3) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        int[] p1 = {30, 45, 20};
        int[] p2 = {50, 10, 40};
        int[] p3 = {25, 35, 30};

        System.out.println(findWinner(p1, p2, p3));
    }
}