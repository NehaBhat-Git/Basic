/*
    Method structure with parameters and return type

    public static dataType methodName (p1type p1, p2type p2, {more}){
            // Method Statements
                return value;
          }
 */
public class Method2Part {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        //int finalScore = score;
        //calling a method will be like calculateScore();


        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("The HighScore is "+highScore);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The next highScore is "+
                calculateScore(gameOver,score,levelCompleted,bonus));
    }
    public static int calculateScore( boolean gameOver, int score, int levelCompleted, int bonus ) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        /*
        return statement returns control to the invoker of a method
        most common usage of the return statement, is to return a value back from a method
         */
        return finalScore;
    }
}
