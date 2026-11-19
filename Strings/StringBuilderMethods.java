public class StringBuilderMethods {
    public static void main(String[] args) {
        // demoAppend();
        // demoInsert();

    }

    // 1) -> append()
    // adds texts at the end
    public static void demoAppend() {
        StringBuilder sp = new StringBuilder("Java");

        System.out.println(sp);
        sp.append(" programming");
        System.out.println(sp);
    }

    // 2) -> insert()
    // adds texts at the specified index
    public static void demoInsert() {
        StringBuilder sp = new StringBuilder("Java");

        System.out.println(sp);
        sp.insert(4, " programming");
        System.out.println(sp);
    }

    // 3) -> delete()
    // deletes char from begin to end-1
    public static void demoDelete() {
        StringBuilder sp = new StringBuilder("Java Programming");

        System.out.println(sp);
        sp.delete(4, 16);
        System.out.println(sp);
    }

    // 4) -> replace()
    // replaces char from begin to end-1
    public static void demoReplace() {
        StringBuilder sp = new StringBuilder("Java Programming");

        System.out.println(sp);
        sp.replace(0, 4, "Python");
        System.out.println(sp);
    }

    // 5) -> reverse()
    // Reverse a String
    public static void demoReverse() {
        StringBuilder sp = new StringBuilder("Java Programming");

        System.out.println(sp);
        sp.reverse();
        System.out.println(sp);
    }

    // 6) -> Capacity()
    // Reverse a String
    public static void demoCapacity() {
        StringBuilder sp = new StringBuilder("Java Programming");

        System.out.println("Capacity : " + sp.capacity());
    }

    // 7) -> ensureCapacity()
    // check capacity
    public static void demoEnsureCapacity() {
        StringBuilder sp = new StringBuilder();

        sp.ensureCapacity(50);

        System.out.println("Capacity : " + sp.capacity());
    }

    // 8) -> setCharAt()
    // change a char at given index
    public static void demoSetChar() {
        StringBuilder sp = new StringBuilder("Java");

        sp.setCharAt(0, 'K');

        System.out.println(sp);
    }

    // 9) -> setLength()
    // go from 0 to given length
    public static void demoSetLength() {
        StringBuilder sp = new StringBuilder("Programming");

        sp.setLength(7);

        System.out.println(sp);
    }

    // 10) subString()
    // 11) toString()

    // methods for string buffer
    // 1) append()
    // 2) reverse()
}
