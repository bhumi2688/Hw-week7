/* 9. Write a java program input sales id, seller's name, sales amount, and salary basic and
     then fined this sales     Commission
      Sales amount >= 50,000 35%
      Sales amount >= 30,000 20%
      >= 20,000 10%
      >= 10,000 5%
       < 10,000 2%      */

import java.util.Scanner;

public class Prgm9_Commission {    //Declare class

    public static void main(String[] args) {    //Main method or pre defined method
        int rate= 0, sales = 0;
        double commission=0.0;


        Scanner sc = new Scanner(System.in);  //used scanner class
        System.out.println("Input Sales ID : ");
        int a = sc.nextInt(); // reading from  user input
        System.out.println("Input seller's name : ");
        String name = sc.next(); //reading from  user input
        System.out.println("Input sales amount : ");
        int b = sc.nextInt();
        System.out.println("Input Basic salary : ");
        int c = sc.nextInt();
        System.out.println("Sales commission :");
        double d = sc.nextDouble();   //reading from  user input

            //nested if else
        if(sales>=50000){
            rate=35;
            commission =sales*0.35;

        } else if (sales>=30000)
        {
            rate=20;
            commission = sales*0.20;
        }else if(sales>=20000)
        {
            rate = 10;
            commission = sales*0.10;
        }else if(sales>=10000)
        {
            rate=5;
            commission=sales*0.05;
        } else if (sales<10000)
        {
            rate=2;
            commission = sales*0.02;
        }else {
            System.out.println("Invalid");
        }
        System.out.println("Commission amount is : " +commission);

    }

}
