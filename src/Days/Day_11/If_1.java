package Days.Day_11;

public class If_1 {
    public static void main(String[] args) {

        int x;
        int y = 10;

        if (y > 0) {
            x = 1;
            System.out.println(" y sifirdan büyük ise x= " + x);
        }


        int score = 100;
        int pay = 1000;

        if (score > 90) {
            pay += (pay * 3 / 100);
        }
        System.out.println("pay = " + pay);

        int sayi1 = 18;


        if (sayi1 % 5 == 0) {
            System.out.println("hi five");
        }
        if (sayi1 % 2 == 0) {
            System.out.println("hi even");
        }


    }
}
