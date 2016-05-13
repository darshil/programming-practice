import java.util.Scanner;

/**
 * Created by Darshil Patel on 5/12/2016.
 */
public class FloatDouble_Challange {


    public static void main (String [] args){
    // Convert a given number of pounds to kilograms
    // 1. Create a variable to store number of pounds
    // 2. Calculate the number of Kilograms for the number and store in a variable
    // 3. Print out the result
    // 1 pound = 0.45359237 KG

        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter a number in Pounds: ");
        double userInput = reader.nextInt();


    double kiloToPoundValue = 0.45359237d;
    double kiloConversion = userInput * kiloToPoundValue;
        System.out.println(kiloConversion);
    }
}
