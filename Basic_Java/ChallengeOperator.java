
/*
Step 1: Create a double variable with a value of 20.00.
Step 2: Create a second variable of type double with a value of 80.00
Step 3: add both numbers together, then manually by 100.00
Step 4: use the remainder operator, to figure out what the remainder from the result of the operation
        in step three, and 40.00, will be.
Step 5: create a boolean variable that assign he values ture, if he remainders in
        step four is 0.00 or false if it's not zero
Step 6: output the boolean variable just to see what the result is.
Step 7: write an if-then statement that displays a message, 'got some remainder',if the boolean in step five
        is not true.
 */
public class ChallengeOperator {
    public static void main(String [] args)
    {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double addingNumbers = ( ( myFirstValue +mySecondValue) * 100.00 );
        System.out.println("Adding Number total: "+addingNumbers);
        double remainderValue = addingNumbers % 40.00d;
        System.out.println("Result of Remainder Operation is: "+remainderValue);
        boolean isNotRemainder = (remainderValue == 0) ? true: false;
        System.out.println("Remainder is: "+isNotRemainder);

        if(!isNotRemainder)
            System.out.println("Getting Some Reminder");
    }

}
