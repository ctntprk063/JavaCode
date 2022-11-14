package Days.Day_15;

public class _4 {
    public static void main(String[] args) {

        int a = 10;
        String text;

       // 1.yöntem
     if (a > 0 && a % 2 == 0){
         text="sifirdan büyük";
     }else
         text="sifirdan kucuk";
     System.out.println("text = " + text);


//2 yöntem
     if(a>0){
         text=(a%2==0)?"sifirdan buyuk" : "sifirdan kücük";
     }
     else
         text=" gecersiz numara";

        System.out.println("text = " + text);

    }
}
