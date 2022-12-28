
// 1. Write a java program that tells us that Input number is odd or even? HINT: use ternary operator (? :)

import java.util.Scanner;

public class Prgm1_OddEven {   //Declare class

    public static void main(String[] args) {   //Main method or pre defined method

        Scanner scanner = new Scanner(System.in);   //scanner class
        System.out.println("Enter any number :");
        int num = scanner.nextInt();   //read from user input

        String result = (num % 2 == 0) ? "Even" : "Odd";  //used turnery operator symbol ? :
        System.out.println("The result is : " + result);

    }
}
//       int a =20;  //Declaring variable
//
//          //Checking if number is even or odd with if else
//        if(a%2==0){
//                    System.out.println("It is even number.");  // if remainder is zero than even number
//        } else
//               {
//                  System.out.println("It is odd number."); //if remainder is not zero than odd number
//               }




