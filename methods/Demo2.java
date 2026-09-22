package methods;

public class Demo2 {

    public static void main(String[] args) {

        // value
        int number = 10;
        int result = makeItHalf(number);
        System.out.println("pass by value : " + result);

        // reference class
        Data newData = new Data();
        newData.number2 = 100;
        makeItHalf_v3(newData);
        System.out.println("pass by reference : " + newData.number2);

    }

    static int makeItHalf(int number) {
        return number /= 2;
    }

    static void makeItHalf_v3(Data myData) {
        myData.number2 = myData.number2 / 2;
    }
}
