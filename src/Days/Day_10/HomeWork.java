package Days.Day_10;

public class HomeWork {
    /*
    Odev1 : Bir evin 2 kapisi ve 2 penceresi icin alarm sistemi programi yazın
Ve verdiginiz degerlere gore alarm sisteminin calisip calismadigini test edin
Odev2: Verilen 3 tane acidan bir ucgen olusturulup olusturlamayacagini check eden bir program yazınız
Kural 1: Ucgenin ic acilarinin toplami 180 e esit olmalidir
Kural 2: Herhangi bir acı 1 den kucuk veya 180 e esit olamaz
*/
    public static void main(String[] args) {

        //Odev1
        boolean kapi1 = true;
        boolean kapi2 = true;
        boolean pencere1 = true;
        boolean pencere2 = false;

        boolean alarm = kapi1 && kapi2 || pencere1 && pencere2;
        System.out.println("alarm  calisiyor mu?  = " + alarm);

        System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<");
        // Odev2
        int a = 1;
        int b = 89;
        int c = 90;
        boolean ucgen = (a + b + c == 180) && a > 0 && b > 0 && c > 0 && a != 180 && b != 180 && c != 180;
        System.out.println("ucgen olusuyor mu ?  = " + ucgen);


    }

}
