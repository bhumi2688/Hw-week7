import java.util.Scanner;

// 11 Write java program using Switch statement and print your groupname 10 times.
public class Prgm11_Switch_Statement {  //Declare class

    public static void main(String[] args) {     //Main method or pre defined method
        Scanner sc = new Scanner(System.in);   //scanner class
        System.out.println("Print your Group Name");
        String group = sc.nextLine();  //reading from user input

          //String group ="Selinium";
         //switch statement
        switch (group){
            case "A":
                System.out.println("Selenium");
                break;
            case "B":
                System.out.println("Selinium");
                break;
            case "C":
                System.out.println("Selinium");
                break;
            case "D":
                System.out.println("Selinium");
                break;
            case"E":
                System.out.println("Selinium");
                break;
            case "F": case "f":
                System.out.println("Selenium");
                break;
            default:
                System.out.println("Invalid entry");

        }


    }

}
