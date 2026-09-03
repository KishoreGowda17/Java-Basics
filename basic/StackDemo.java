public class StackDemo {

    static void a() 
    {
        b();
    }

    static void b() 
    {
        c();
    }

    static void c() 
    {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        a();
    }
}
