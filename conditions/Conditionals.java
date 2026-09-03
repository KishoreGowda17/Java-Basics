package conditions;
import java.util.*;

public class Conditionals {
  public static void main(String[] args) {
    // taking input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age : ");
    int age = sc.nextInt();

    System.out.println();

    // Checking condition
    if (age > 18) {
      System.out.println("Eligible to vote");
    } else {
      System.out.println("not Eligible");
    }
  }
}
