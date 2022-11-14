package Exercises.DatatypAndArithmetic;

import java.util.Scanner;

public class Sorular {
    // Günün Soruları
    //  1- Girilen bir sayının birler basamağını ekrana yazdırınız.
    //  2- Girilen bir sayının onlar basamağını ekrana yazdırınız.
    // 3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.
    // 4- Girilen 3 basamaklı bir sayınızn basamaklarının toplamını ekrana yazdırınız.
    // -> 435 -> 4,3,5  => 4+3+5 => 12
    // 5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak
    // ekrana yazdırınız.Örneğin 435 -> 534 sayı olarak bulunacak.
    // 6- 2020 yılına kadar geçen gün sayısını bulunuz.
    // 7- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.
    public static void main(String[] args) {

        //  1- Girilen bir sayının birler basamağını ekrana yazdırınız.
        Scanner sc = new Scanner(System.in);
        System.out.print("bir sayi giriniz = ");
        int sayi = sc.nextInt();

        int birlerBasamagi = sayi % 10;
        System.out.println("birlerBasamagi = " + birlerBasamagi);

        //  2- Girilen bir sayının onlar basamağını ekrana yazdırınız.

        int onlarBasamagi = (sayi / 10) % 10;
        System.out.println("onlarBasamagi = " + onlarBasamagi);

        // 3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.
        int yuzlerBasamagi = (sayi / 100) % 10;
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);

        // 4- Girilen 3 basamaklı bir sayınızn basamaklarının toplamını ekrana yazdırınız.
        int basamakToplam = birlerBasamagi + onlarBasamagi + yuzlerBasamagi;
        System.out.println("basamakToplam = " + basamakToplam);

        // 5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak
        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while (sayi > 0) {

            System.out.print(sayi % 10);
            sayi /= 10;
        }

        // 6- 2020 yılına kadar geçen gün sayısını bulunuz.
        System.out.println();

        int gunSayisi = (2020 * 365) + (2020 / 4);
        System.out.println("gunSayisi = " + gunSayisi);

        // 7- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.

        System.out.print("vize notu girin = ");
        int vize = sc.nextInt();
        System.out.print("final notu giriniz = ");
        int finalNotu = sc.nextInt();
        double notOrtalama = (vize * 0.4) + (finalNotu * 0.6);
        System.out.println("notOrtalama = " + notOrtalama);
        if (notOrtalama>=50){
            System.out.println("  tebrikler gectiniz");
        }

    }
}
