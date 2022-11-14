package Days.Day_9;

public class Unary2 {
    public static void main(String[] args) {

        int a=20;
      int b=  a++; //post increment a nin degerini 1 artiriyor
        System.out.println("b = " + b);
         b=++a;    // pre increment  a nin degerini 1 artiriyor
        System.out.println("b = " + b);
        System.out.println("a = " + a);


        int i=3;
        i++;
        System.out.println("i = " + i);
        ++i;
        System.out.println("i = " + i);

    }
}
