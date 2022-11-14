package Exercises.Ornekler;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {

        //Klavyeden okunacak bir e-mail adresindeki kullanıcı adını
        // ve sunucu adını ekrana yazdıran bilgisayar programını Java dilinde yazınız e-mail adresi örneği: turkaslan@gmail.com
        //ekrana: kullaniciadi: turkaslan  sunucu: gmail yazacak.

        // todo bu soruya tekrar bakilmali

        Scanner sc=new Scanner(System.in);
        System.out.print(" email adresi giriniz = ");
        String str=sc.nextLine();
       int  mail=str.indexOf('@');

        System.out.println("mail = " + mail);









    }
}
