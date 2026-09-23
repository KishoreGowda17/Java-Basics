package questions;

public class showName {

    static String showNames(String... names) {

        for (String name : names) {
            System.out.println(name);
        }

        return "";
    }

    public static void main(String[] args) {

        showNames("Kish", "Sid", "Shri", "Venky", "Liki");
    }
}