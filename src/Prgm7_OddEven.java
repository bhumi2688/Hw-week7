import java.util.Scanner;

//7. Write a java program to input any number and find out if it’s odd or even
public class Prgm7_OddEven {  //Declare class

    public static void main(String[] args) {  //Main method
        Scanner sc = new Scanner(System.in);  //Scanner class
        System.out.println("Enter any number :");
        int a = sc.nextInt();  //reads from user input
          //If else statemetn
        if(a%2==0){
            System.out.println("Entered number is even number"); //condition
        } else {
            System.out.println("Entered number is odd number");
        }


    }



}
