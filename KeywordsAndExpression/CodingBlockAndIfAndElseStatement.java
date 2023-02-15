/*
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
 */
public class CodingBlockAndIfAndElseStatement {
    public static void main(String[] args) {
       boolean gameover = true;
       int score = 5000;
       int levelCompleted = 5;
       int bounus = 100;

       if(score < 5000){
           System.out.println("Your score is less than 5000");
       }else {
           System.out.println("Got here");
       }


        if(score <= 5000){
            System.out.println("Your score is less than or euqal to 5000");
        }else {
            System.out.println("Got here");
        }


        if(score <= 5000 && score > 1000){
            System.out.println("Your score was less than or equal to 5000 but greater than 1000");
        }else if(score < 1000){
            System.out.println("Your score was less than 1000");
        }else{
            System.out.println("Got here");
        }
    }
}
