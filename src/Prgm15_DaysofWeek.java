/* 15. Write a Java program which input any number between 1 to 7 and
it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;

public class Prgm15_DaysofWeek {   //Declare class name

    public static void main(String[] args) {  //Main method or pre defined method
        Scanner sc = new Scanner(System.in);  //Scanner class
        System.out.println("The Days name is :");
        int num = sc.nextInt();

           // swtich statemetn
        switch (num) {
            case 1:
                System.out.println("Monday");  // will print statement
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:    //will print if condition will not meet
                System.out.println("Week contains 1 to 7 days");
        }
    }
}