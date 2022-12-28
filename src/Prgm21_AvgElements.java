
//21. Write a Java program to calculate the average value of array elements.

public class Prgm21_AvgElements {  //Declare class

    public static void main(String[] args) { //Main method or pre defined method
             int [] num ={10,20,3,4,6,7};   //input array
             int total =0;
             for(int i=0; i<num.length ;i++){  //for loop
                 total = total +num[i];
                 double average = total/6;  //calculate average value
                 System.out.println("Average value of array element is :" + average); //print statement
             }

    }

}
