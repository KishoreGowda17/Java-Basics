package ArrayPractice.IntegerArrayPractice;

public class passedStudents {

    public static int passedStudents(int marks[]) {
        int count = 0;

        for (int i : marks) {
            if (i >= 35 && i <= 100) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int marks[] = { 40, 22, 35, 90, 18 };

        System.out.println("Number of Students that passed the exam are : " + passedStudents(marks));
    }
}
