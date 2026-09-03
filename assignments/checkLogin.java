package assignments;

import java.util.*;

public class checkLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username : ");
        String userName = sc.next();
        System.out.println("Enter Password : ");
        String password = sc.next();

        if (userName.equals("Admin") && password.equals("1234")) {
            System.out.println("Logged in Successfully");
        } else {
            System.out.println("Login error check username and password");
        }

    }
}