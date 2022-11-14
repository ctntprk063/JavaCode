package Days.Day_10;

public class Operators {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        int num3 = 40;

        boolean result = num1 < num2 || num3 > num1; // Relational -> Logical -> Assignment
        System.out.println("result = " + result);

        System.out.println("-----------------");

        String havaDurumu;
        int derece;
        havaDurumu = "Gunesli";
        derece = 19;

        boolean disariCikilirmi = havaDurumu == "Yagmurlu" || derece>=20; // Relational -> Logical -> Assignment
        System.out.println(disariCikilirmi);

        System.out.println("----------------");

        int num = 3;
        boolean sum;
        sum = --num == 3 || num == 2 && num-- == 2; // Unary -> Relational -> Logical -> Assignment
        // 2 == 3 || 2 == 2 && 2 == 2
        //    F   ||    T   &&    T
        //    F   ||         T
        //        T
        // sum = T;
        System.out.println(sum);

        System.out.println("---------------");

        boolean a = true, b = true;
        int c = 20;
        a = (c!=30) && (b = false);

        System.out.println(a);
    }
}
