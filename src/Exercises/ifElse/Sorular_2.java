package Exercises.ifElse;

import java.util.Scanner;

public class Sorular_2 {

    /*
       Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("bir sayi giriniz = ");
        int sayi = sc.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("sayi cifttir. ");
        } else if (sayi % 2 == 1) {
            System.out.println("sayi tektir");
        }
//            if (sayi==0) {
//                System.out.println("sayi sifirdir...");
//
//            }
        System.out.println("......... 2. Soru.........");

        /*
    Girilen bir string de kaç tane b harfi olduğunu yazdırınız.
    */
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String str = oku.nextLine();
        int i = 0;
        int bHarfi = 0;

        while (i<str.length()){
            if (str.charAt(i)=='b'){
                bHarfi++;
            }
            i++;
        }
        System.out.println(bHarfi);
    }
}
