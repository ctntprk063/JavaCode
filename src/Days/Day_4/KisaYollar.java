package Days.Day_4;

public class KisaYollar {
    public static void main(String[] args) {

        System.out.println(12345678); // ctrl d ayni satiri bir altta yazar
        System.out.println(12345678);
        System.out.println("12345678");//parantezin icindeki secilip  shift + " isaretine basilir

        System.out.println("istanbul");// sadece tirnak ici yazilirsa, tirnaktan sonra .sout yazilip tiklanir

        System.out.println(" Cetin \n Toprak"); //alt satira gecer
        System.out.println("bu sefer \t basarabilirsin.");// tab ekler
        System.out.println("bu sefer \r basarabilirsin.");// r den öncekini siliyor
        System.out.println("bu sefer\b basarabilirsin.");// önceki karakteri siler
        System.out.println("bu sefer \' basarabilirsin. ");// ' eklenir
        System.out.println("bu sefer \" basarabilirsin.\" "); // " eklenir
        System.out.println("bu sefer \\ basarabilirsin."); // \ eklenir

        // Ctrl Alt L kodlari hizalar (optimize eder)

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE); // maximum yazilacak int degeri
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE); // maximum yazilacak Byte degeri
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        int a = 20;
        int b = 30;

        a = b;// a yi b ye esitledik
        System.out.println("a = " + a);


    }
}
