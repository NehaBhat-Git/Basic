/*
    Write a method printYearsAndDays with parameter of type long named minutes.
    The method should not return anything (void) and it needs to calculate the years and days from the ,minutes parameter.
    If the parameter is less than 0, print text "Invalid Value".
    Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

    XX represents the original value minutes.
    YY represents the calculated years.
    ZZ represents the calculated days

    EXAMPLES OF INPUT/OUTPUT:

    printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
    printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
    printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"

    TIPS:

    Be extra careful about spaces in the printed message.
    Use the remainder operator

    1 hour = 60 minutes
    1 day = 24 hours
    1 year = 365 days

    NOTES
    The printYearsAndDays method needs to be defined as public static ​like we have been doing so far in the course.
 */

public class ChallengeTen {
    public static void main(String[] args) {
    printYearsAndDays(561600);
    printYearsAndDays(525600);
    printYearsAndDays(1051200);
    }
    public static void printYearsAndDays (long minutes){
        //calculate years and days from minutes parameter
        // 1hr = 60 min , 1 day = 24 hr, 1 yr = 365 days
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        long hr = minutes / 60;  //561600 / 60 --> 9360
        long day = hr / 24;  // 9360 / 24 --> 390
        long yr = day / 365; //  390/365 --> 1
        long remainingYr = day % 365;

        System.out.println(minutes+" min = "+yr+" y and "+remainingYr+" d");

    }
}
