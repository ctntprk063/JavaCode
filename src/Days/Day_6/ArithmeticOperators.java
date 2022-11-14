package Days.Day_6;

public class ArithmeticOperators {
    public static void main(String[] args) {


        int hesaplama = 18 / 2 * 4; //öncelik sirasi ayni olan islemlerde soldan saga dogru devam eder
        System.out.println("hesaplama = " + hesaplama);

        System.out.println("merhaba "+true);
        System.out.println(23+"merhaba");

        System.out.println("\"\\__/\"");


        int d=10;
        double i= d;
        System.out.println(i);
        
        int a=10, b=4;
        
        double c= (double)a/b;
        System.out.println("c = " + c);//2,5

        double x= a/(double)b;
        System.out.println("x = " + x);//2,5

        double y= a/b;
        System.out.println("y = " + y);//2,0

    }
}
