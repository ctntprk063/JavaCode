package Days.Day_15;

import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("vize notunu giriniz = ");
        int vize = sc.nextInt();
        System.out.println("ara sinav  notu giriniz = ");
        int araSinav = sc.nextInt();
        System.out.println("final sinav  notu giriniz = ");
        int finalNotu = sc.nextInt();

        int ortalama = (vize + araSinav + finalNotu) / 3;
        String dersNotu;

        dersNotu = ( ortalama <= 49) ? "Notunuz F" : (ortalama>=50&&ortalama<65)?"Notunuz C": (ortalama>=65&&ortalama<80)?" Notunuz B": (ortalama>=80&&ortalama<100)?" notunuz A": " yanlis not girisi";


        System.out.print("not ortalamaniz = " + ortalama + " dersNotu = " + dersNotu);



    }
}
