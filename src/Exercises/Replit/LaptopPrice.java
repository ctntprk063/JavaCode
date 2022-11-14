package Exercises.Replit;

import java.util.Scanner;

public class LaptopPrice {
   /* This is an IT market and the customer wants to buy a new laptop. You will write a code that gives the laptop price.
  ## Step
1. Ask user for a screen size. If screen size is equals to 13.3, add  $200 to the laptop price.
If screen size is equals to  15.0 - add  $300 to the laptop price. If screen size is equals to  17.3 - add  $400 to the laptop price.

            2. Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price.
             If CPU type equals to i5, add  $250 to the laptop price. If CPU type equals to i7, add  $350 to the laptop price.

3. Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price.
4. Then, ask user for storage type. There are 2 options: SSD and HDD.
If it's HDD - add $50 to the laptop price for every 500gb.  If it's SSD - add $100 to the laptop price for every 500GB.

5. Then ask user for for screen resolution. There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.*/

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("please write the screen size = ");
        double screen=sc.nextDouble();
        int sum=0;
        //1.Step
        if (screen==15.0){
            sum=300;
        }else
            System.out.println("please write the cpu type = ");
        String cpu=sc.nextLine();
        if (cpu=="i7"){

            sum +=350;
        } else
        System.out.println("please write the ram size = ");
        int ram=sc.nextInt();
        if (ram==8){

            sum +=100;
        }
        System.out.println("sum = " + sum);


    }

}
