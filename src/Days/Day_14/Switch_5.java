package Days.Day_14;

public class Switch_5 {
    public static void main(String[] args) {


        String ayAdi = "agustos";
        String mevsim = " ";
        switch (ayAdi) {
            case "aralik":
            case "ocak":
            case "subat":
                mevsim = "kis aylari";break;
            case "mart":
            case "nisan":
            case "mayis":
                mevsim = "Ilkbahar aylari";break;
            case "haziran":
            case "temmuz":
            case "agustos":
                mevsim = "Yaz mevsimi aylari";break;
            case "eylul":
            case "ekim":
            case "kasim":
                mevsim = "sonbahar aylari";break;
            default:
                System.out.println("böyle bir mevsim yok");


        }
        System.out.println("mevsim = " + mevsim);

    }
}
