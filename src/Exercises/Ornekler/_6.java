package Exercises.Ornekler;

public class _6 {
    public static void main(String[] args) {
        //Ekrandan okunan 3 karakter verinin (String) en büyüğünü bularak 
        // ekrana yazdıran bilgisayar programını Java programlama dilinde yazınız.
        //todo bu soruya tekrar bakilmali
        
        String a="Ceti";
        String b="Safiye";
        String c="Talhatpr";
        
        int enBuyuk=a.length();
        if (b.length()>enBuyuk){
            enBuyuk=b.length();
            System.out.println("enBuyuk b  ve harf sayisi = " + enBuyuk);
        }
        if (c.length()>enBuyuk){
            enBuyuk=c.length();
            System.out.println("enBuyuk c ve harf sayisi  = " + enBuyuk);
        } if (enBuyuk==a.length()){
            System.out.println("enBuyuk a ve harf sayisi  = " + enBuyuk);
        }
        
        
    }
}
