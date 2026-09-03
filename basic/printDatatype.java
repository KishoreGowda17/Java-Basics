public class printDatatype {
    public static void main(String[] args) {
        byte num = 1;
        short num2 = 10;
        int age = 10;
        float days = 5.5f;
        double months = 8.5;
        boolean statement = true;
        char letter = 'a';
        long salary = 40000000l;

        System.out.println(((Object)num).getClass().getSimpleName());
        System.out.println(((Object)num2).getClass().getSimpleName());
        System.out.println(((Object)age).getClass().getSimpleName());
        System.out.println(((Object)days).getClass().getSimpleName());
        System.out.println(((Object)months).getClass().getSimpleName());
        System.out.println(((Object)statement).getClass().getSimpleName());
        System.out.println(((Object)letter).getClass().getSimpleName());
        System.out.println(((Object)salary).getClass().getSimpleName());
    }
    
}
