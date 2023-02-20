/*
    Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
    If one of the parameters is less than 0, print text "Invalid Value".
    If all numbers are equal print text "All numbers are equal"
    If all numbers are different print text "All numbers are different".
    Otherwise, print "Neither all are equal nor different".

    EXAMPLES OF INPUT/OUTPUT:

    printEqual(1, 1, 1); should print text All numbers are equal
    printEqual(1, 1, 2); should print text Neither all are equal nor different
    printEqual(-1, -1, -1); should print text Invalid Value
    printEqual(1, 2, 3); should print text All numbers are different
    TIP: Be extremely careful about spaces in the printed message.

    NOTES

    The solution will not be accepted if there are extra spaces.
    The method printEqual needs to be defined as public static ​like we have been doing so far in the course.
     */
public class ChallengeEleven {
    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,0,1);
        printEqual(1,2,1);
        printEqual(1,2,3);
        printEqual(-1,-1,0);
    }
    public static void printEqual(int x, int y, int z){
        if(x>=0 && y>=0 && z>=0) {
            if (y == z && z == x) {
                System.out.println("All numbers are equal");
            } else if (x == y || y == z || z == x) {
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }
        }
        else {
            System.out.println("Invalid Value");
        }
    }
}
