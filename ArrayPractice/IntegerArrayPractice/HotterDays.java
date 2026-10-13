package ArrayPractice.IntegerArrayPractice;

public class HotterDays {
    public static int findHotterDays(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > arr[i + 1]) {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        int week[] = { 30, 32, 31, 35, 36, 34, 37 };

        System.out.println("Number of days hotter : "+findHotterDays(week));
    }
}
