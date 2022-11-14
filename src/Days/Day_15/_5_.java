package Days.Day_15;

import java.util.Scanner;

public class _5_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz = ");
        int sayi1 = sc.nextInt();
        System.out.print("2. sayiyi giriniz");
        int sayi2 = sc.nextInt();

        int sayi;

        sayi = (sayi1 > sayi2) ? sayi1 : sayi2;
        System.out.println("en büyük sayi = " + sayi);




    }
}
