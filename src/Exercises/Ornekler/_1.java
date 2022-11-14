package Exercises.Ornekler;

public class _1 {
    public static void main(String[] args) {

        //Bir malın fiyatı 1500ytl dir.Bu mal,%18 i kadar KDVsi alınarak satılacaktır.
        // Bu malın KDV sini ve satılacağı fiyatı hesaplayıp ekrana yazdırınız.
        int urun=1500;
        int kdv=urun*18/100;
        int kadvliUrun=urun+kdv;

        System.out.println("kdvliUrun = " + kadvliUrun);

    }
}
