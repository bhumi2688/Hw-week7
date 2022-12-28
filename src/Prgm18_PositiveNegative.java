import java.util.Scanner;

//18. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
public class Prgm18_PositiveNegative { //Declare class

    public static void main (String[] args){    //main method

        Scanner sc = new Scanner(System.in);  //scanner class
        System.out.println("Enter a number"); //Will print statement
        int a = sc.nextInt();  //reading number from user

        if(a<0){  //will check if number greater than o is positive or not
            System.out.println("The number is positive");
        }else if(a>0){   //will check number less tha zero is negative or not
            System.out.println("The number is negative");
        }else{  //will execute if above both condition is false
            System.out.println("The number is zero");
        }


    }


}
