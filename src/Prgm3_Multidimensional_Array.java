
//3. Declare multidimensional array and store 5 countries and their capital and print them in console.
public class Prgm3_Multidimensional_Array {  //Declare class

    public static void main(String[] args) {  //Main method or pre defined method


        String name[][] = {{"India"}, {"Egypt"}, {"Italy"}, {"Japan"}, {"Kenya"}};
        String name1[][] = {{"Delhi"}, {"Cairo"}, {"Rome"}, {"Tokyo"}, {"Nairobi"}};
       // String[][] strArray = new String[5][2];  //Created obj

            //print the statement
        System.out.println(" The country is :" + name[0][0] + " and " + " The capital is :" + name1[0][0]);
        System.out.println("The country is :" + name[1][0] + " and " + " The capital is :" + name1[1][0]);
        System.out.println("The country is :" + name[2][0] + " and " + " The capital is :" + name1[2][0]);
        System.out.println("The country is :" + name[3][0] + " and " + " The capital is :" + name1[3][0]);
        System.out.println("The country is :" + name[4][0] + " and " + " The capital is :" + name1[4][0]);

    }
}