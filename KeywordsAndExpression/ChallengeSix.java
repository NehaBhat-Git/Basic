/*      Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
        The method should return boolean, and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

        EXAMPLES OF INPUT/OUTPUT:

        areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
        areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
        areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
        areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.

        TIP: Use paper and pencil.
        TIP: Use casting.
 */
public class ChallengeSix {
    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(3.12345, 3.1234);
        System.out.println(result);
        result = areEqualByThreeDecimalPlaces(-3.12345, 3.1234);
        System.out.println(result);
        result = areEqualByThreeDecimalPlaces(3.0,3.0);
        System.out.println(result);
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        return (int)(firstNumber*1000)==(int)(secondNumber*1000);

    }
}
