package Exercises.DatatypAndArithmetic;

public class DataTyp_1 {
    public static void main(String[] args) {

        double d=25.6;
        int a= (int)d;
        System.out.println(a);// double integera cevirme

        String s="25";
        int sonuc=Integer.parseInt(s); // stringi integere cevirme
        System.out.println("sonuc = " + sonuc);

        int x=41;
        String y=Integer.toString(x); // integer stringe cevirme
        System.out.println("y = " + y);




    }
}
