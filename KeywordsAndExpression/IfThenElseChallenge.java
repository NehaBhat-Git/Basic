public class IfThenElseChallenge {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bounus = 100;

        int finalScore = score;

        if(gameOver){
            finalScore+= (levelCompleted * bounus);
            finalScore += 1000;
            System.out.println("Your final score was "+finalScore);
        }

        //Challenge Change the value of them
         score = 10000;
         levelCompleted = 8;
         bounus = 200;

         finalScore = score;

        if(gameOver){
            finalScore+= (levelCompleted * bounus);
            System.out.println("Your final score was "+finalScore);
        }
    }
}
