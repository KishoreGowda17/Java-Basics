package nestedLoops;

public class WhileInsideWhile {
    public static void main(String[] args) {
        // DoWhile inside Dowhile
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= 4);
            System.err.println();
            i++;
        } while (i <= 4);

        // While inside while
        // int i = 1;
        // while (i <= 4) {
        // int j = 1;
        // while (j <= 4) {
        // System.out.print(j + " ");
        // j++;
        // }
        // i++;
        // System.out.println();
        // }
    }
}