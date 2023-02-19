/*
    Create two methods with the same name: convertTOCentimeters

    The first method has one parameter of type int, which represents the entire height in inches. You'll convert inches to centimeters, in this method, and pass back the number of centimeters, as a double.

    The second method has two parameters of type int, one to represent height in feet, and one to represent the remaining height in inches. So if a person is 5 foot, 8 inches, the values 5 for feet and 8 for inches would
    be passed to this method. This method will convert feet and inches to just inches, the call the first method, to get the number of centimeters, also returning the value as a double.

    Both methods should return a real number or decimal value for total height in centimeters.
    Call both methods, and print out the results.
    Inches to Centimeters is 1 inch = 2.54 cm
    Remember one foot = 12 inches.
 */
public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        double valueOfCentimeter=  convertToCentimeters(6,0);
        System.out.println("Inches to Centimeter is: "+valueOfCentimeter+" cm");
    }
    public static double convertToCentimeters(int heightInInches){ //68

        return heightInInches * 2.54; //68 * 2.54 --> 172.72
    }
    public static double convertToCentimeters(int heightInFeet, int heightInInches){  // if a person is 5 foot, 8 inches , the value 5 for feet and 8 for inches would be passed to this method.
        // 1 inch = 2.54 cm and 1 foot = 12 inches
        int feetToInches = (heightInFeet * 12) + heightInInches;
        System.out.println(heightInFeet+" feet and "+ heightInInches+" Inches is: "+feetToInches+" Inches");
        return convertToCentimeters(feetToInches);
    }
}
