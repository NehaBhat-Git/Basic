/*
    Method declares executable code that can be invoked, passing a fixed number of values as arguments
    A method is a way of reducing code duplication.
    Method can be used many times with potentially different results, by passing data to the method in the form of arguments.

    Syntax:
         public static void methodName(){
             //Method statements form the method body
        }

      Syntax of method in parameters
        public static void methodName(p1type p1, p2type p2, {more}){
             //Method statements form the method body
        }
 */
public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bounus = 100;

        int finalScore = score;
        //calling a method will be like calculateScore();
        calculateScore(true, 800, 5,100);

        score = 10000;
        levelCompleted = 8;
        bounus = 200;

        finalScore = score;

        if(gameOver){
            finalScore+= (levelCompleted * bounus);
            System.out.println("Your final score was "+finalScore);
        }
    }
    public static void calculateScore( boolean gameOver, int score, int levelCompleted, int bonus ){

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalScore = score;

        if(gameOver){
            finalScore+= (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was "+finalScore);
        }

    }
}
