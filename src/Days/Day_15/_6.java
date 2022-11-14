package Days.Day_15;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz = ");
        int sayi1 = sc.nextInt();
        System.out.print("2. sayiyi giriniz");
        int sayi2 = sc.nextInt();

        int sayi;

        sayi = (sayi1 > sayi2) ? (sayi1+sayi2) : (sayi2-sayi1);
        System.out.println(" sayi = " + sayi);


    }
}
