package Exercises.DatatypAndArithmetic;

public class ArithmeticOperators_2 {
    public static void main(String[] args){

        int a=12;
        int b=5;

        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a - b));
        System.out.println("a/b = " +( a / b));
        System.out.println("a*b = " + (a * b));

        double d=7;
        System.out.println("a%d = " +( a % d));
        System.out.println("(a/d) = " + (a / d));

        int artirma=a++;
        System.out.println("artirma = " + artirma);//12
        int artirma2=a++;
        System.out.println("artirma2 = " + artirma2);//13
        int artirma3=a++;
        System.out.println("artirma3 = " + artirma3);//14
        int artirma4=++a;
        System.out.println("artirma4 = " + artirma4);//16 ? burada neden 2 artirma gerceklesti
        int artirma5=++a;
        System.out.println("artirma5 = " + artirma5);//17


    }
}
