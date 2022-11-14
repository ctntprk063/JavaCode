package Days.Day_11;

public class if_2 {
    public static void main(String[] args) {

        int age=19;

        if (age>=18){
            System.out.println(" oy kullanabilirsiniz.");
        }
        if(age<=18){
            System.out.println("oy kullanamazsiniz.");
        }


        int num1=111;
        int num2=11;
        int num3=13;

        int enBuyuk=num1;

        if (num2>num1){
            enBuyuk=num2;
        }
if (num3>num2){
    enBuyuk=num3;
}

        System.out.println("enBuyuk = " + enBuyuk);


    }
}
