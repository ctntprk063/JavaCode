package Exercises.DatatypAndArithmetic;

public class ArithmeticOperators_3 {
    public static void  main(String[] args){
        int a=17;

        int azaltma=a--;
        System.out.println("azaltma = " + azaltma);//17
        int azaltma2=a--;
        System.out.println("azaltma2 = " + azaltma2);//16
        int azaltma3= --a;
        System.out.println("azaltma3 = " + azaltma3);//14
        int azaltma4=--a;
        System.out.println("azaltma4 = " + azaltma4);//13
        int azaltma5=a--;
        System.out.println("azaltma5 = " + azaltma5);//13

        int sonuc= a++ + a++ + a++;
                // 12     13   14
        System.out.println("sonuc = " + sonuc);
    }
}
