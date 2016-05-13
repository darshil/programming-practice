/**
 * Created by Darshil Patel on 5/13/2016.
 */
public class Strings {

    public static void main (String [] args) {

        // A string can contain sequence of characters

        String myFisrtString = "This is a string";
        System.out.println("myString is equal to " + myFisrtString);
        myFisrtString += ", and this is more";
        System.out.println("myString is equal to " + myFisrtString);
        myFisrtString += ". \u00A9 2016";
        System.out.println("myString is equal to " + myFisrtString);

        String numberString = "53";
        numberString += "36";
        System.out.println(numberString);

        String lastString = "36";
        int earthString =  53;
        lastString = lastString + earthString;
        System.out.println(lastString);

        double doubleNumber = 30.32;
        lastString += doubleNumber;
        System.out.println(lastString);

    }
}
