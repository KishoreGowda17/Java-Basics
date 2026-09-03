package assignments;

public class marks {
    public static void main(String[] args) {
        int maths = 80;
        int physics = 79;
        int chemistry = 75;

        int total_marks = maths + physics + chemistry;

        int average = total_marks / 3;

        double percentage = (total_marks * 100) / 300;

        System.out.println("Marks : " + total_marks);
        System.out.println("Average : " + average);
        System.out.println("Percentage : " + percentage + " %");

    }
}
