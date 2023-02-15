/*
    If- then statement is most basic of all the control flow statements.
    It tells your program to execute a certain section of code only

    known as ConditionL Logic

    Conditional logic allow us to check a condition and execute certain code based on whether that condition is true or false
 */

public class IfThenStatement {
   public static void main(String[] args) {
      boolean isAlien = false;
      if (isAlien == false)
         System.out.println("It is not an alien!");

      if (isAlien == true) {
         System.out.println("It is not an alien!");  //this output will not get printed
      }
      System.out.println("And I'm scared of Aliens");
      int topScore = 80;
      if (topScore > 100) { // "==" equal to  || "!=" not equal to || ">" greater than || ">=" greater than equal ||"<" lesser than || "<=" lesser than equal
         System.out.println("You got the high Score!");
      }

      int secondTopScore = 60;
      if ((topScore > secondTopScore) && (topScore < 100)) {// && operator should have both the condition true
         System.out.println("Greater than second top score and less than 100");
      }

      //Operator OR(||) operator // OR operator should have either one or both the conditions should be true
      if ((topScore > 90 ) || (secondTopScore <= 90)){
         System.out.println("Either or both of the condition are true");
      }

      int newValue = 50;
      if ( newValue == 50){
         System.out.println("This is true");
      }
      boolean isCar = false;
      if(!isCar)
      {
         System.out.println("This is not going to happen");
      }
      /* Ternary Operator
      // Java officially calls it conditional Operator - has three operands, the only operator currently in java that does have three
      // operand1 ? operand2 : operand3
      First operand is always a boolean test but other operands don't have to be boolean values
      */

      String makeOfCar = "BMW";
      boolean isDomestic = (makeOfCar == "BMW") ? false : true;
                           // operand1        ?  operand2 : operand3
      if(isDomestic)
         System.out.println("This car is domestic to our Country");

      String s = (isDomestic) ? "This car is domestic" :"This car is not domestic";
      System.out.println(s);
   }
}