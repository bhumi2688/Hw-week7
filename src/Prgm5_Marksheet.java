
/*5. Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class Prgm5_Marksheet {   //Declare class

    public static void main(String[] args) {   //Main method or pre defined method
        Scanner sc = new Scanner(System.in);   //scanner class
        System.out.println("MarkSheet");

        System.out.println("Student Name");
        String name = sc.next();  //reads from user input
        System.out.println("Roll No");
        int rollNo = sc.nextInt();
        System.out.println("Subject            :        Marks");
        System.out.println("Enter Maths Marks :");
        int maths = sc.nextInt();
        System.out.println("Enter English Marks :");
        int english = sc.nextInt();
        System.out.println("Enter Science Marks :");
        int science = sc.nextInt();

         String Result;
         String Grade;

        int total = 300;
        float sum = maths+english+science;
        System.out.println("Total marks is :" +total);

        float percentage = sum/total*100;   //percentage formula
        System.out.println("Total Percentage is :" + percentage);

             //nested if else
        if(percentage>=35)
        {
            System.out.println("Result is Pass");
        }
         if (percentage>=80)
         {
             System.out.println("The Grade is A+");
         } else if (percentage>=60)
         {
             System.out.println("The Grade is A");
         }else if (percentage>=50)
         {
             System.out.println("The Grade is B");
         }else if (percentage>=35)
         {
             System.out.println("The Grade is C");
         }else
         {
             System.out.println("Fail");
         }
        System.out.println(" --------------------------------------------------------");
        System.out.println("|                                                       |");
        System.out.println("|                     Mark Sheet                        |");
        System.out.println("|                                                       |");
        System.out.println("|______                                                 |");
        System.out.println("|      Name                    : " +name+"                   |");
        System.out.println("|      Roll No                 : " +rollNo+"                         |");
        System.out.println("|_______________________________________________________|");
        System.out.println("|      Subjects                :   marks                |");
        System.out.println("|_______________________________________________________|");
        System.out.println("|       Maths                  : " +maths+"             |");
        System.out.println("|       English                : " +english+"           |");
        System.out.println("|       Science                : " +science+"           |");
        System.out.println("|_______________________________________________________|");
        System.out.println("|       Total                  : " +total+"             |");
        System.out.println("|_______________________________________________________|");
        System.out.println("|       Percentage             : " +percentage+"        |");
        System.out.println("|       Result                 : "  +          "         |");
        System.out.println("|       Grade                  : "  +                    "|");
        System.out.println("|_______________________________________________________|");
    }
}
