/*
    First And Last Digit Sum
    Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
    If the number is negative then the method needs to return -1 to indicate an invalid value.

    Example input/output

    sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
    sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
    sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
    sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
    sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 */

public class ChallengeSeveenteen {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }
    public static int sumFirstAndLastDigit(int number){
        /*
            if the number is negative number then return -1
         */
        if(number < 0){
            return -1;
        }
        // Stores the last digit in the lastDigit variable.
        int lastDigit = number%10;
        /*
         * As long as number is greater than 9 that means number has at least 2
         * digits left and we need to keep looping and take the digits off
         * until we are left with number which is less or equal to 9.
         * Once number is less or equal to 9, that means we got the
         * first digit of the number.
         */
        while(number > 9){
            number/= 10;
        }
        // Add the last digit of number parameter and first digit
        // retrieved from while loop.
        return lastDigit +number;

    }
}
