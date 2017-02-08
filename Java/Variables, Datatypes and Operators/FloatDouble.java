/**
 * Created by Owner on 5/12/2016.
 */
public class FloatDouble {

    public static void main (String [] args){

        // width of int = 32 (4 bytes)
        int intValue = 5/2; // rounds number to nearest decimal

        // width of float = 32 (4 bytes)
        float floatValue = (float) 36.53;

        // width of double = 64 (8 bytes)
        double doubleValue = 53.36d;

        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
    }
}
