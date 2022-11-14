package Days.Day_6.Tasks;

import java.util.Scanner;

public class Task3 {
//    Write a Java program that converts mile to km
// ́Sample output:
//            85.0 mile is equal to 136.79424 km

    public static void main(String[] args) {

        //1.Yöntem
        double mil=85;
        double km=mil*1.609344;
        System.out.println("85.0 mile is equal to " + km + " km");


        //2.yöntem
        Scanner sc=new Scanner(System.in);
        System.out.print("bir uzaklik giriniz= ");
        double uzaklik=sc.nextDouble();

        double donustur=uzaklik*1.609344;
        System.out.println(uzaklik+ " mile is equal to " + donustur+" km");




    }
}
