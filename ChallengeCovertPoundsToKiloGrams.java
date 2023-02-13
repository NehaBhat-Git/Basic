/* Problem Statement
 Convert a given number of pounds to kilograms.
 STEPS:
        1. Create a variable with the appropriate type to store the number of converted to kilograms
        2. Calculate the result i.e. the number of kilograms bases on the contents of the variable above and store the result in a 2nd appropriate varaible.
        3. Print ou the result.
 HINTS : 1 Pounds = 0.45359237 KiloGram
*/

public class ChallengeCovertPoundsToKiloGrams {
    public static void main(String [] args){
        float myKiloGrams = 0.45359237f;
        float myPounds = 200f;
        float result = myKiloGrams * myPounds;
        System.out.print("Converted Value of Pound to KiloG is: "+result);

    }
}
