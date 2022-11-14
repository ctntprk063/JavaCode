package Days.Day_14;

import java.util.Scanner;

public class Switch_2 {
    public static void main(String[] args) {
        // Stringle switch yazdik
//        Scanner sc=new Scanner(System.in);
//        System.out.println("bir yazi giriniz");
//        String ayAdi=sc.nextLine();

        String ayAdi="nisan";
        switch (ayAdi){

            case "ocak":
                System.out.println(1);break;
            case "subat":
                System.out.println(2);break;
            case "mart":
                System.out.println(3);break;
            case "nisan":
                System.out.println(4);break;
            case "mayis":
                System.out.println(5);break;
            case "haziran":
                System.out.println(6);break;
            case "temmuz":
                System.out.println(7);break;
            case "agustos":
                System.out.println(8);break;
            case "eylul":
                System.out.println(9);break;
                case "ekim":
                System.out.println(10);break;
            case "kasim":
                System.out.println(11);break;
            case "aralik":
                System.out.println(12);break;

            default:
                System.out.println("yanlis ay adi girdiniz");









        }
    }
}
