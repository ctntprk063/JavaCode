package Exercises.DatatypAndArithmetic;

public class NarrowingTypeCasting {
    public static void main(String[] args) {

        double x=25.66587945212125555555;
        short cevir=(short) x;
        float cevir2=(float)x;
        int cevir3=(int)cevir2;

        System.out.println(" double sonuc = "+ x);
        System.out.println(" doubleden short a cevirme = "+ cevir);
        System.out.println(" doubleden float a cevirme = "+ cevir2);
        System.out.println(" Floattan  int e cevirme = "+ cevir3);


    }
}
