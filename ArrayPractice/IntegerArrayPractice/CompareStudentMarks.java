package ArrayPractice.IntegerArrayPractice;

public class CompareStudentMarks {
    public static int countHigherMarks(int[] ravi, int[] sita) {
        int count = 0;

        for (int i = 0; i < ravi.length; i++) {
            if (ravi[i] > sita[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] ravi = {78, 65, 90, 55, 82};
        int[] sita = {70, 80, 85, 60, 82};

        System.out.println(countHigherMarks(ravi, sita));
    }
}