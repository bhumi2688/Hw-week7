import java.util.Scanner;

/*12.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
public class Prg12_Calculator_Symbol {   //declare class

    public static void main(String[] args) {   //Main method or pre defined method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value :");  //to input my first number
        int a = sc.nextInt();
        System.out.println("Enter value :"); //to input my second number
        int b =sc.nextInt();
        System.out.println("Enter any symbol from(+,-./,*");  // enter symbol
        char symbol = sc.next().charAt(0);

         //nested if else
        if(symbol=='+')
        {
            System.out.println("Addition is : " + (a+b));
        } else if (symbol=='-') {
            System.out.println("Subtraction is :" + (a-b));
        } else if (symbol=='/'){
            System.out.println("Division is : " + (a/b));
        }else if (symbol=='*'){
            System.out.println("Multiplication is : " + (a*b));
        }else {
            System.out.println("Invalid symbol");
        }

    }
}