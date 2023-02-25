/* =====================
Sum 3 and 5 Challenge
=====================

*Create a for loop using a range of numbers from 1 to 1000 inclusive.
*Sum all the numbers that can be divided by both 3 and 5
*Print out the numbers that have met the above conditions
*break out of the loop once you have found 5 numbers that met the conditions.
*After breaking out of the loop, print the sum of the numbers that met the conditions.
*Note: type all code in the main method
*/


public class Sum3and5Challenge {
    public static void main(String[] args) {
        System.out.print("The number is : ");
        int count = 0;
        int sum=0;
        for (int i = 1; i <= 100; i++) {        //real ans -->15 30 45 60 75 90
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(i+" ");    //print 15,30,45,60,75
                sum+= i;
                count++;                        //1,2,3,4,5
                if (count == 5) {               //false, false,false,false,true
                    break;
                }
            }
        }
        System.out.print("\nSum of the number is: "+sum);
    }
}
