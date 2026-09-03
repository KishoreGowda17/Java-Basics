/*Demonstration of typecasting 
    Put smaller data into larger container

*/
// package datatypes;

// public class widening {

//     public static void main(String[] args) {
//         int num = 100;
//         int result = num;

//         System.out.println(result);
//     }

// }

//Narrowing -- putting larger data into smaller datatype

package datatypes;

public class widening {

    public static void main(String[] args) {
        int num = 100;
        byte result = (byte) num;

        System.out.println(result);
    }

}