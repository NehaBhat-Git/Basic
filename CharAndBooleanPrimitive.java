public class CharAndBooleanPrimitive {
    public static void main( String[]args){
        /* Char occupies two bytes of memory or 16 bits.
         The reason it's not just a single byte is that it allows you to store unicode characters.

         Unicode's characters:
            Unicode is a universal international standard character encoding that is capable of representing most of the world's written languages.

         */

        char mychar = 'D';
        char myUniCodeChar = '\u0044';
        System.out.println(mychar);
        System.out.println(myUniCodeChar);


        char myUniCodeChar2 = '\u00A9';
        System.out.println(myUniCodeChar2);

        /* Boolean value allows us TRUE or FALSE , YES or NO , 1 or 0.
            Can be set of two values only True or False
         */
        boolean myTrueBoolenValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyTwo = true;


    }
}
