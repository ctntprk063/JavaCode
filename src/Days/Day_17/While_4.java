package Days.Day_17;

public class While_4 {
    public static void main(String[] args) {

        // 0 dan 50 ye kadar olan sayilari tolami nedir

        int i = 0;
        int son = 50;// 0 + 1 + 2
//                       1  + 2
//                         3  + 3
        //                   6 + 4=
        int sum = 0;
        do {

            sum = sum + i;
            //        =  0  +  0           0 +  1        1 + 2   3 + 3   6  + 4
            //            =0                    1             3       6       10
            System.out.println("sum = " + sum);// 0  1  3  6  10
            i++;// 1  2 3  4  5
        } while (i < son);

        System.out.println("sum = " + sum);// 10

        // ------------------------------------------------------------------

        i = 0;
        son = 50;
        int toplam = 0;

        while (i < son) {

            toplam = toplam + i;
            i++;
        }
        System.out.println("toplam = " + toplam);



        //---------------------------------------------------------

        int baslangic = 49;
        int bitis = 0;
        int sonToplam = 0;
        while (baslangic > bitis) {

            sonToplam = sonToplam + baslangic;

            baslangic--;
        }

        System.out.println("sonToplam = " + sonToplam);
        System.out.println("sonToplam = " + (sonToplam == sum));


    }

}
