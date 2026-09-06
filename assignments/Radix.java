import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        String num = sc.next();
        String result = "na";

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            if (ch =='0' || ch == '1') {
                result = "Binary";
            } else if (ch > '0' && ch <= '7') {
                result = "Octal";
            } else if (ch > '0' && ch <= '9') {
                result = "Decimal";
            } else if ((ch > '0' && ch <= '9') || (ch > 'A' && ch <= 'F') || (ch > 'a' && ch <= 'f')) {
                result = "HexaDecimal";
            }

        }

        if (result.equals("Binary")) {
            System.out.println("Number is Binary and radix is 2");
        } else if (result.equals("Octal")) {
            System.out.println("Number is Octal and radix is 8");
        } else if (result.equals("Decimal")) {
            System.out.println("Number is Decimal and radix is 10");
        } else if (result.equals("HexaDecimal")) {
            System.out.println("Number is HexaDecimal and radix is 16");
        } else {
            System.out.println("Invalid number");
        }

    }

}
