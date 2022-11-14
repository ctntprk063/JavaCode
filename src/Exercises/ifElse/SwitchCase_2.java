package Exercises.ifElse;

import java.util.Scanner;

public class SwitchCase_2 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
        Scanner sc = new Scanner(System.in);
        System.out.print("bir sayi giriniz = ");
        int sayi = sc.nextInt();
        int onlarBasamagi = (sayi / 10) % 10;
        onlarBasamagi = Math.abs(onlarBasamagi);// mutlak degerini aliyor, negatif degerde verilse Math onu pozitife ceviriyor

        switch (onlarBasamagi) {

            case 0:
                System.out.println("sifir");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üc");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;

            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;


        }


    }
}
