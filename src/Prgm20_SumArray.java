
//20. Write a Java program to sum values of an array.
public class Prgm20_SumArray {   // Declare class

    public static void main (String [] args)     // main method or pre defined error
    {
        int x[] = {2,4,7,9,10};   //declare variable in array
        int sum = 0;
        for (int i : x)
            sum +=i;
        System.out.println("The sum of array is : " + sum); //will print sum of array
    }
}
