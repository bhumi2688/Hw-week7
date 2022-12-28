
/*10.Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
      if any other alphabet should be invalid entry
           */

import java.util.Scanner;

public class Prgm10_If_elseCityName {  //Declare class

    public static void main(String[] args) {  //Main method or pre defined method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F : ");
        String city = sc.nextLine();  //reading from user input

        //nested if else
        if (city.equals("A")){   //used .equals
            System.out.println("Ahmedabad");
        } else if (city.equals("B") || city.equals("b")) {  //used or operator
            System.out.println("Baroda");
        } else if (city.equalsIgnoreCase("C")) {   //will ignore upper or lower case
            System.out.println("Calcutta");
        } else if(city.equalsIgnoreCase("D")){
            System.out.println("Delhi");
        } else if (city.equalsIgnoreCase("E")){
            System.out.println("Europe");
        }else if(city.equalsIgnoreCase("F")){
            System.out.println("Faridabad");
        }else{
            System.out.println(" Invalid Entry");
        }

    }


}
