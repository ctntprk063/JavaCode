package Exercises.Ornekler;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {

        //  Klavyeden bir boy uzunluğu isteyiniz. 175’e eşit veya küçükse ekrana ‘KISA BOYLUSUNUZ.’,
        // 175’den büyükse ekrana “UZUN BOYLUSUNUZ.’ mesajını yazdıracak şekilde programı yazınız.

        Scanner sc=new Scanner(System.in);
        System.out.print("boyunuzu giriniz = ");
        int boy =sc.nextInt();

        if (boy>175){
            System.out.println(" Uzun boylusunuz ama insallah o serefsiz uzun adama benzemezsiniz...");
        }
        else if (boy<=175){
            System.out.println("Kisa boylusunuz ");
        }



    }
}
