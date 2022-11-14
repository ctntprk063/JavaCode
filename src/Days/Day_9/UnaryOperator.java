package Days.Day_9;

public class UnaryOperator {
    public static void main(String[] args) {

        int a=10;
        a++;
        ++a;
        System.out.println("a = " + a);
        int b=++a;
        b=a++;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        b=++a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        int c= a+b;
        System.out.println("c = " + c);
    }
}
