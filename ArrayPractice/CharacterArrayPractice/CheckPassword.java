package ArrayPractice.CharacterArrayPractice;

public class CheckPassword {
    static boolean isValidPassword(char[] password) {
        boolean isUpper = false;
        boolean isLower = false;
        boolean isNum = false;
        boolean isSplChar = false;

        for (char c : password) {
            if (c >= 'A' && c <= 'Z') {
                isUpper = true;
            } else if (c >= 'a' && c <= 'z') {
                isLower = true;
            } else if (c >= '0' && c <= '9') {
                isNum = true;
            } else {
                isSplChar = true;
            }
        }
    
        if (password.length < 8) {
            System.out.println("The length of the password is less than 8");
        }
        if (!isUpper) {
            System.out.println("Upper Case is missing");
        }
        if (!isLower) {
            System.out.println("Lower Case is missing");
        }
        if (!isNum) {
            System.out.println("Number is missing");
        }
        if (!isSplChar) {
            System.out.println("Special Character is missing");
        }

        return password.length >= 8 && isUpper && isLower && isNum && isSplChar;
    }

    public static void main(String[] args) {
        char[] password = { 'k', 'i', 's', 'H', '0', 'R', 'e', '@', '1', '7' };
        char[] password2 = { 'a', 'a', 'a', 'a', 'a', 'a', 'a' };
        isValidPassword(password);
        isValidPassword(password2);
    }
}
