package Exercises.DatatypAndArithmetic.OperatorAlistirma;

public class Alistirma_3 {
    //        2 + 2 + 3 + 4
//        "2 + 2 " + 3 + 4
//        2 + " 2 + 3 " + 4
//        3 + 4 + " 2 + 2"
//        "2 + 2 " + (3 + 4)
//        "(2 + 2) " + (3 < 4)
//        "hello 34 " + 2 * 4
//        2 + "(int) 2.0" + 2 * 2 + 2
//        4 + 1 + 9 + "." + (-3 + 10) + 11 / 3
//        8 + 6 * -2 + 4 + "0" + (2 + 5)
//        1 + 1 + "8 - 2" + (8 - 2) + 1 + 1
//        5 + 2 + "(1 + 1)" + 4 + 2 * 3
//        "1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 != 9)
    public static void main(String[] args) {
        System.out.println("a =  " + 2 + 2 + 3 + 4);  //2234
        System.out.println("b =  " + "2 + 2" + 3 + 4);  //2+234
        System.out.println("c =  " +  2 + " 2 + 3 " + 4);  //2 23 4
        System.out.println("d =  " +  2 + " 2 + 3 " + 4);  //2 2 + 3 4
        System.out.println("e =  " +  3 + 4 + " 2 + 2");  // 34 2 + 2
        System.out.println("f =  " +  1 + 1 + "8 - 2" + (8 - 2) + 1 + 1);  // 118 - 2611
        System.out.println("g =  " +   2 + "(int) 2.0" + 2 * 2 + 2);  // 2(int) 2.042







    }
}
