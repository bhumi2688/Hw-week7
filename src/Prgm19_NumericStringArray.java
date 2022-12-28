import java.util.Arrays;

//19. Write a Java program to sort a numeric array and a string array.
public class Prgm19_NumericStringArray {   //Declar class name

    public static void main (String[]args){  //Main method or pre defined method

        String [] name={"Rose","Hibiscus","Marigold","Tulip"};  //Declared string
        int [] num = {12,2,3,7,8,9};   //Declared variable

                      //numeric array
        System.out.println("Original numeric array : "+Arrays.toString(num));
        Arrays.sort(num);  // sort syntax to sort numeric array
        System.out.println("Sorted numeric array : "+Arrays.toString(num) );

                     //String array
        System.out.println("Original string array : "+Arrays.toString(name));
        Arrays.sort(name);  // sort syntax to sort string array
        System.out.println("Sorted string array : "+Arrays.toString(name));


    }

}
