package Days.Day_15;

public class _1_TernaryOperator {
    public static void main(String[] args) {

        int x, y;
        x = 20;

        // Condition true dondugu icin ? isleme alindi
        y = (x == 1) ? 61 : 90;
        System.out.println("y = " + y);
        // Condition true dondugu icin ? isleme alindi
        y = (x == 20) ? 61 : 90;
        System.out.println("y2 = " + y);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        boolean b;
        int a = 5;
        int c = 7;

        b = (a == 5 && c == 6) ? true : false;
        System.out.println("b = " + b);


    }
}
