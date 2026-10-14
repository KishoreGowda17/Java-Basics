package ArrayPractice.IntegerArrayPractice;

public class HighestScoringOver {
    public static int findBestOver(int[] runs) {
        int max = runs[0];
        int over = 1;

        for (int i = 1; i < runs.length; i++) {
            if (runs[i] > max) {
                max = runs[i];
                over = i + 1;
            }
        }

        return over;
    }

    public static void main(String[] args) {
        int[] runs = {6, 12, 4, 15, 9};

        System.out.println(findBestOver(runs));
    }
}