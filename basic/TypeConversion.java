// type promotion : Automatic conversion of smaller datatype to larger data type by java before performing an operation

// Golden rules :-
/*
1.Byte short and char are always promoted to int before arithmetic operation
2.If operands are of different types, java promotes the smaller type ro widest
3.The result of the promotion is of that promoted type
*/

public class TypeConversion {
    public static void main(String[] args) {
        byte a = 10;
        short b = 100;
        int c = 100000;
        long d = 1000000l;
        char e = 'K';
        float f = 17.82f;
        double g = 222.2902;

        System.out.println();
        System.out.println("byte");
        System.out.println();
        int add0 = a + a; // byte and byte
        int add1 = a + b; // byte and short
        int add2 = a + c; // byte and int
        long add3 = a + d; // byte and long
        int add4 = a + e; // byte and char
        float add5 = a + f; // byte and float
        double add6 = a + g; // byte and double
        System.out.println("byte and byte : " + add0);
        System.out.println("byte and short " + add1);
        System.out.println("byte and int" + add2);
        System.out.println("byte and long" + add3);
        System.out.println("byte and char" + add4);
        System.out.println("byte and float" + add5);
        System.out.println("byte and double" + add6);

        System.out.println();

        System.out.println("short");
        add0 = b + a;// short and byte
        add1 = b + b;// short and short
        add2 = b + c;// short and int
        add3 = b + d;// short and long
        add4 = b + e;// short and char
        add5 = b + f;// short and float
        add6 = b + g;// short and double

        System.out.println(add0);
        System.out.println(add1);
        System.out.println(add2);
        System.out.println(add3);
        System.out.println(add4);
        System.out.println(add5);
        System.out.println(add6);

        System.out.println();
        System.out.println("int");
        add0 = c + a;// int and byte
        add1 = c + b;// int and short
        add2 = c + c;// int and int
        add3 = c + d;// int and long
        add4 = c + e;// int and char
        add5 = c + f;// int and float
        add6 = c + g;// int and double

        System.out.println(add0);
        System.out.println(add1);
        System.out.println(add2);
        System.out.println(add3);
        System.out.println(add4);
        System.out.println(add5);
        System.out.println(add6);

        System.out.println();
        System.out.println("long");
        long add_ = d + a;// int and byte
        long add1_ = d + b;// int and short
        long add2_ = d + c;// int and int
        add3 = d + d;// int and long
        long add4_ = d + e;// int and char
        add5 = d + f;// int and float
        add6 = d + g;// int and double

        System.out.println(add_); // long and
        System.out.println(add1_); // long and
        System.out.println(add2_); // long and
        System.out.println(add3); // long and
        System.out.println(add4_); // long and
        System.out.println(add5); // long and
        System.out.println(add6); // long and

        System.out.println();
        System.out.println("char");
        add0 = c + a;// int and byte
        add1 = c + b;// int and short
        add2 = c + c;// int and int
        add3 = c + d;// int and long
        add4 = c + e;// int and char
        add5 = c + f;// int and float
        add6 = c + g;// int and double
    }
}