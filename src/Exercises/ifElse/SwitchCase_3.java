package Exercises.ifElse;

import java.util.Scanner;

public class SwitchCase_3 {
    public static void main(String[] args) {

        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız


        Scanner sc = new Scanner(System.in);
        System.out.print("bir ay numarasi giriniz = ");
        int ayNo = sc.nextInt();

        // birinci yöntem
        switch (ayNo){

            case 1:
                System.out.println(31);break;
            case  2:
                System.out.println(28);break;
            case  3:
                System.out.println(31);break;
            case  4:
                System.out.println(30);break;
            case  5:
                System.out.println(31);break;
            case  6:
                System.out.println(30);break;
            case  7:
                System.out.println(31);break;
            case  8:
                System.out.println(31);break;
            case  9:
                System.out.println(30);break;
            case  10:
                System.out.println(31);break;
            case  11:
                System.out.println(30);break;
            case  12:
                System.out.println(31);break;

            default:
                System.out.println("yanlis ay kodu girdiniz");


        }

        // 2. yöntem
        switch (ayNo){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 : System.out.println(31);break; //
            case 4:
            case 6:
            case 9:
            case 11: System.out.println(30);break;
            case 2:
                System.out.print("yil giriniz= ");
                int yil=sc.nextInt();
                if (yil%4==0){
                    System.out.println(29);
                }else System.out.println(28);



        }









    }
}
