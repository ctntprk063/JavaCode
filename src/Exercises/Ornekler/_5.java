package Exercises.Ornekler;

public class _5 {
    public static void main(String[] args) {

     //   Ekrandan okunan 3 sayısal verinin en büyüğünü bularak ekrana yazdıran bilgisayar programını Java programlama dilinde yazınız.
        
        int a=30;
        int b=35;
        int c=39;
        
        int enBuyuk=a;
        if (b>enBuyuk){
            enBuyuk=b;
            
        }  if (c>enBuyuk) {
            enBuyuk=c;
            
        }
        System.out.println("enBuyuk = " + enBuyuk);

    }
}
