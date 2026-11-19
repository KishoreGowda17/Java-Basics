public class RegMetaChar {
    public static void main(String[] args) {

        // demoMatchOneDigit();
        // demoOneWordChar();
        // demoNonDigitMatch();
        // demoOneSpace();
        // demoNonSpace();
        // demoNonWordChar();

        // demoStarQuant();
        // demoPlusQuant();
        // demoExactCount();
        // demoMinMaxQuant();
        demoQstMarkQuant();

    }

    // 1) \d --> matches one digit
    public static void demoMatchOneDigit() {
        String a = "8";
        System.out.println(a.matches("\\d"));
        System.out.println("A".matches("\\d"));
        System.out.println();
    }

    // 2) \w --> matches one word character
    public static void demoOneWordChar() {
        System.out.println("A".matches("\\w"));
        System.out.println("9".matches("\\w"));
        System.out.println("@".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println();
    }

    // 3) \D --> Non digit matching
    public static void demoNonDigitMatch() {
        System.out.println("A".matches("\\D"));
        System.out.println("9".matches("\\D"));
        System.out.println();
    }

    // 4) \s --> matches space
    public static void demoOneSpace() {
        System.out.println(" ".matches("\\s"));
        System.out.println("A".matches("\\s"));
        System.out.println();
    }

    // 5) \S --> matches any no space char
    public static void demoNonSpace() {
        System.out.println("A".matches("\\S"));
        System.out.println(" ".matches("\\S"));
        System.out.println();
    }

    // 6) \W --> matches special character
    public static void demoNonWordChar() {
        System.out.println("#".matches("\\W"));
        System.out.println("a".matches("\\W"));
        System.out.println();
    }

    // Quantifiers --> tell how many chars to match
    // 1) star Quantifier -- 0 or more
    public static void demoStarQuant() {
        String s1 = "abcbaaac";
        String s2 = "";
        String s3 = "abc7";

        System.out.println(s1.matches("[abc]*"));
        System.out.println(s2.matches("[abc]*"));
        System.out.println(s3.matches("[abc]*"));
    }

    // 2) plus Quantifier -- 1 or more

    public static void demoPlusQuant() {
        String s1 = "abcbaaac";
        String s2 = "";
        String s3 = "abcbca";

        System.out.println(s1.matches("[abc]+"));
        System.out.println(s2.matches("[abc]+"));
        System.out.println(s3.matches("[abc]+"));
    }

    // 3) Exact count

    public static void demoExactCount() {
        String s1 = "abcbaaac";
        String s2 = "";
        String s3 = "abc";

        System.out.println(s1.matches("[abc]{3}"));
        System.out.println(s2.matches("[abc]{3}"));
        System.out.println(s3.matches("[abc]{3}"));
    }

    // 4) {min , max} -- check within range
    public static void demoMinMaxQuant() {
        String s1 = "abcbcaac";
        String s2 = "ab";
        String s3 = "abccbaaa";

        System.out.println(s1.matches("[abc]{3,7}"));
        System.out.println(s2.matches("[abc]{3,7}"));
        System.out.println(s2.matches("[abc]{3,7}"));
    }

    // 4) question mark -- check for 0 and 1
    public static void demoQstMarkQuant() {
        String s1 = "ac";
        String s2 = "abc";
        String s3 = "abcc";

        System.out.println(s1.matches("ab?c"));
        System.out.println(s2.matches("ab?c"));
        System.out.println(s2.matches("ab?c"));
    }


}
