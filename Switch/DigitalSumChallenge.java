/*
    write a method, with the name sumDigits, that has a single parameter named number, of type int, and it should return an int.
    method should only take a number that is +ve number.

    If a negative number is passed, it should return -1, meaning an invalid value was passed.

    The method should parse out each digit from the number, and sum the digit up.

    So if 125 is the value passed to the method, code should sum each digit, in this case,1 +2+5, return 8, as a value.

    And another example, if the value is 1000, the code should each digit, 1+0+0+0, return 1 as a value

    If the number is a single digit number, simply return the number itself as the result.

 */
public class DigitalSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(-1234));
    }
    public static int sumDigits(int number){ //12
        if(number < 1){
            return -1;
        }
        int sum = 0;
        while(number > 0){
          sum +=  number % 10;       //= 12%10 --> 2        1%10 -->1
            number /= 10;              //12/10 -->1     1/10 -->0
                                        // 0+2 = 2       2+1= 3
        }
        return sum; //3
    }
}
