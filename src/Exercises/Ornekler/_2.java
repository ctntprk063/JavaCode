package Exercises.Ornekler;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {

        //Yarıçap Değerini Klavyeden okuyarak bir dairenin alanını ve çevresini hesaplayan programı yazınız.
        Scanner sc=new Scanner(System.in);
        System.out.print("dairenin yari capini giriniz = ");
        int r=sc.nextInt();

        double pi=3.14;
        double cevre=2*pi*r;
        double alan=pi*r*r;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);




    }
}
