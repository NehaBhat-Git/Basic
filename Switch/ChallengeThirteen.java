/*
    Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.
    NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
 */
public class ChallengeThirteen {
    public static void main(String[] args) {
        printNumberInWord(1);
        printNumberInWord(-1);
    }
    public static void printNumberInWord (int number){
       /*return switch (number) {
           case 0 -> "ZERO";
           case 1 -> "ONE";
           case 2 -> "TWO";
           case 3 -> "THREE";
           case 4 -> "FOUR";
           case 5 -> "FIVE";
           case 6 -> "SIX";
           case 7 -> "SEVEN";
           case 8 -> "EIGHT";
           case 9 -> "NINE";
           default -> "OTHER";
       };*/
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}
