public class ChallengeEight {
    public static void main(String[] args) {
        boolean result = hasTeen(9,99,19);
        System.out.println(result);
        result = hasTeen(23, 15, 42);
        System.out.println(result);
        result = hasTeen(22, 23, 34);
        System.out.println(result);
        boolean resultISTeen = isTeen(17);
        System.out.println(resultISTeen);
        resultISTeen = isTeen(7);
        System.out.print(resultISTeen);

    }
    public static boolean hasTeen (int numOne, int numTwo, int numThree) {
        return ((numOne >= 13 && numOne <= 19) || (numTwo >= 13 && numTwo <= 19) || (numThree >= 13 && numThree <= 19));
    }
    public static boolean isTeen (int numFour){
        return (numFour >= 13 && numFour <= 19);
    }
}

