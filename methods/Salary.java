package methods;

public class Salary {

    static void calculateSalary() {
        calculateTax();
        System.out.println("Final Salary");
    }

    static void calculateTax() {
        calculateDA();
        System.out.println("Tax Done");
    }

    static void calculateDA() {
        calculateHRA();
        System.out.println("DA Done");
    }

    static void calculateHRA() {
        calculateBasic();
        System.out.println("HRA Done");
    }

    static void calculateBasic() {
        System.out.println("Basic calculated");
    }

    public static void main(String[] args) {
        calculateSalary();
    }

}