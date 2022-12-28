import java.util.Scanner;

//14. Write a program that tells us input value is number or an alphabet or symbol.
public class Prgm14_Input_ValueNumber {  //Declare class

    public static void main(String[]args){   //Main method or pre defined method
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value is number or alphabet or symbol :");
        char a =sc.next().charAt(0);  //reading number/string from user
              //nested if else
        if((a >= 'a'&& a<= 'z')|| (a >= 'A'&& a<= 'Z')){
            System.out.println("Is a Alphabet");    // print statement
        } else if (a>= '0' && a<='9') {
            System.out.println("Is a Number");  //print statemenmt
        }else {
            System.out.println("Is a Symbol");   //print statement
        }


    }
}
