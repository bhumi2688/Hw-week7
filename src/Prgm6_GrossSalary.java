
/* 6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF Print in following format
 */

import java.util.Scanner;

public class Prgm6_GrossSalary {  //Declare class

    public static void main(String[] args) {   //Main method or pre defined method
               
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Employee Id");
        int a = sc.nextInt();  //reads from user inputs
        System.out.println("Enter Employee name");
        String name = sc.next();
        System.out.println("Enter basic Salary");
         int basic = sc.nextInt();
         double HRA = basic*10/100;
         double DA = basic*8/100;
         double TA = basic*9/100;
         double PF = basic*20/100;
         double Grosssalary = basic+ HRA + TA + DA - PF;  //formula for gross salary
               //print salary slip
        System.out.println("|_____________________________________________|");
        System.out.println("|               Salary Slip                   |");
        System.out.println("|_____________________________________________|");
        System.out.println("| Employee Id                 :"  +a+"        |");
        System.out.println("| Employee Name               :" +name+"      |");
        System.out.println("|_____________________________________________|");
        System.out.println("| Basic Salary                :" +basic+"     |");
        System.out.println("| HRA 10%                     :" +HRA+"       |");
        System.out.println("| TA                          :" + TA+"       |");
        System.out.println("| DA                          :" + DA+"       |");
        System.out.println("| PF - 20&                    :" + PF+"       |");
        System.out.println("|_____________________________________________|");
        System.out.println("|Gross salary                 :"+Grosssalary+"|");
        System.out.println("|=============================================|");

    }
    
    
    
    
    
    
    
}
