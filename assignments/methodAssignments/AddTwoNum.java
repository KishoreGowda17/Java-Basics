package methodAssignments;

public class AddTwoNum {

    int add(int x, int y) {
        return x + y;
    }
    // static int add(int x, int y) {
    // return x + y;
    // }

    public static void main(String[] args) {
        AddTwoNum obj = new AddTwoNum();
        // int sum = add(10, 20);
        int sum = obj.add(10, 20);

        System.out.println(sum);
    }
}
