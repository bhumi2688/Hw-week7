//13. Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.


public class Prgm13_Print_Numbers {  //Declare class
    public static void main(String[] args) {  //Main method or pre defined class
        System.out.println("Divided by 3: ");  //Print statement
        for (int i=1; i<100; i++) {  //loop method
            if (i%3==0)   //% represents when one number is divided by another
                System.out.println(i + " , "); //"" used to place space between numbers
        }
        System.out.println("Divided by 5: ");  // print statement
        for(int i=1 ; i<100 ; i++){   //For lool
            if(i%5==0)   //if statement
                System.out.println(i + " , ");
        }







}}
