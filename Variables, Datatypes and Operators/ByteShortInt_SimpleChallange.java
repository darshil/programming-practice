/**
 * Created by Owner on 5/10/2016.
 */
public class ByteShortInt_SimpleChallange {

    public static void main (String [] args){

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 5000L + 10L *  (byteValue+shortValue+intValue);
        short shortTotal = (short) (100 + 10*(byteValue+shortValue+intValue));
        System.out.println(longTotal);
        System.out.println(shortTotal);

    }
}
