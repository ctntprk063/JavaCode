package Exercises.DatatypAndArithmetic.OperatorAlistirma;

public class Alistirma_1 {
    //        2 + 3 * 4 - 6
    //        14 / 7 * 2 + 30 / 5 + 1
//        (12 + 3) / 4 * 2
//        (238 % 10 + 3) % 7
//        (18 - 7) * (43 % 10)
//        2 + 19 % 5 - (11 * (5 / 2))
//        813 % 100 / 3 + 2.4
//        26 % 10 % 4 * 3
//        22 + 4 * 2
//        23 % 8 % 3
//        12 - 2 - 3
//        6/2 + 7/3
//        6 * 7 % 4
//        3 * 4 + 2 * 3
//        177 % 100 % 10 / 2
//        89 % (5 + 5) % 5
//        392 / 10 % 10 / 2
//        8 * 2 - 7 / 4
//        37 % 20 % 3 * 4
//        17 % 10 / 4
    public static void main(String[] args) {

        int a = 2 + 3 * 4 - 6; //8
        System.out.println("a = " + a);
        int b= 14 / 7 * 2 + 30 / 5 + 1; //11
        System.out.println("b = " + b);
        System.out.println(" c = "+ (12 + 3) / 4 * 2);//6
        System.out.println("d = " +  (238 % 10 + 3) % 7); // 4
        System.out.println("e = " + (18 - 7) * (43 % 10)); //33
        int f= 2 + 19 % 5 - (11 * (5 / 2)); //-16
        System.out.println("f = " + f);
     //  System.out.println("f2 = " +  2 + 19 % 5 - (11 * (5 / 2))); // todo ???  burda inti stringe ceviriyor egeer arada (-) islemi yerine (+) olsaydi hata vermeyecekti
        System.out.println("g = " +  813 % 100 / 3 + 2.4); //6.4  // Todo burda 6.4 olmasi gerekirken 42.4 cikiyor, degiskene atayinca 6.4 cikiyor
                              //         13    /3    + 2.4
        double x=  813 % 100 / 3 + 2.4;
        System.out.println("x = " + x);

        System.out.println(" h = " + 26 % 10 % 4 * 3);// 6
        System.out.println(" i = " + 22 + 4 * 2);// 228  string
        System.out.println(" j = " +  23 % 8 % 3);// 1
      //  System.out.println(" k = " + 12 - 2 - 3);// int i stringe cevirmecek ama islemde eksiler oldugu icin string yapamiyor ve hata veriyor
        //ama eger bir degiskene atarsak int olarak okuyor ve sorun cikarmiyor. k örnegi gibi
       int k= 12 - 2 - 3;
        System.out.println("k = " + k);
        System.out.println("l = " + 6/2 + 7/3 );//32  önce matematiksel islem yapti sonra string olarak yazdi
        System.out.println("m = " +  6 * 7 % 4);//2
        System.out.println("n = " + 3 * 4 + 2 * 3);// 126
        System.out.println("o = " + 177 % 100 % 10 / 2);//3
        System.out.println("ö = " + 89 % (5 + 5) % 5);//4
        System.out.println("p = " +  392 / 10 % 10 / 2);// 4
        int r= 8 * 2 - 7 / 4;
        System.out.println("r = " + r);//15
        //System.out.println("r = " +  8 * 2 - 7 / 4);//15 arada (-) oldugu icin hata veriyor
        System.out.println("s = " +  37 % 20 % 3 * 4); //8
        System.out.println("t = " +   17 % 10 / 4); //1

    }
}
