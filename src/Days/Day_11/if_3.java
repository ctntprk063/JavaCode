package Days.Day_11;

public class if_3 {
    public static void main(String[] args) {

        double balance=120;
        int score=8;
        if (score>=8){
            balance=balance+50;
        }
        if (score>6){
            balance=balance+20;
        }
        else {
            balance=balance-10;
        }

        System.out.println("balance = " + balance);



        int sayi=21;

        if (sayi%2==0){
            System.out.println("sayi cifttir.");
        }else
            System.out.println("sayi tektir");

        
        int deger=90;
        double pay=1000;
        if (deger>90){
            pay+=pay*3/100;
            
            
        }else {
            pay+=pay/100;
        }
        System.out.println("pay = " + pay);
        
        
    }
}
