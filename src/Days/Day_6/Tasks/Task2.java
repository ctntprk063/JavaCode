package Days.Day_6.Tasks;

import java.util.Scanner;

public class Task2 {

    //    Write a Java program to convert Fahrenheit to Celcius
// ́Sample output:
//            70,2 Celcius is equal to 158.36 fahreneit
//
    public static void main(String[] args) {

        //1. yöntem
        double celcius=70.2;
        double fahrenheit=(celcius*1.8)+32;
        System.out.println("70,2 Celcius is equal to " + fahrenheit + " fahrenheit");

        //2.yöntem
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir Celcius girin = ");
        double sicaklik=sc.nextDouble();

        double fahr=sicaklik*1.8+32;
        System.out.println(sicaklik + " Celcius is equal to " + fahr + " fahrenheit");
      //  System.out.println("fahr = " + fahr);







    }
}
