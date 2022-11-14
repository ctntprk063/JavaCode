package Days.Day_14;

public class Switch_6 {

    public static void main(String[] args) {

        int ayNo = 2;
        int yil = 2020;
        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");break;
            case 2:
                if (ayNo == 2 && yil % 4 == 0)
                    System.out.println("29");
                else
                    System.out.println("28");break;
                default:
                System.out.println("Hatalı no");
        }


    }
}
