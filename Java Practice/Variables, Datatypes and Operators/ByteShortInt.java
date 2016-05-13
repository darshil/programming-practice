/**
 * Created by Darshil Patel on 5/10/2016.
 */
public class ByteShortInt {

    public static void main(String[] args){

        // width of 32
        int minValue = -2147483648; // this is a literal
        int maxValue = 214_7_483_647; // you can use underscore to make numbers readable

        // byte has a width of 8
        byte myFirstByte = 10;
        byte minByte = -128; // more efficient if there are many calculations
        byte maxByte = 127; // uses less memory than int

        byte finalValue = (byte)(maxByte/2); // casts from an int to byte


        // short has a width of 16
        short myFirstShort = 3653;
        short maxShort = 32767;
        short minShort = -32767;

        // long has a width of 64
        long longValue =  10234342L; // put an L at the end of the number






    }

}
