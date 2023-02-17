/*
    In this challenge we're going to create two methods:
    The first method should be named displayHighScorePosition.
     - This method should have two parameters, one for a player's name, and one for a player's position in a high score lsit.
     - This method should print a message like "Tim managed to get into position 2 on the high score list"
    The second method should be named calculateHighScorePosition
     - This method should have only one parameter, the player's score.
     - This method should return a number between 1 and 4, based on the score values shown in this table.
                Score                                              Result
         Score greater than or equal to 1000                           1
         Score greater than or equal to 500 but less than 1000         2
         Score greater than or equal to 100 but less than 500          3
         All other scores                                              4

     finally, we'll call both methods and display the results for the following scores: 1500, 1000, 500, 100 and 25.

 */
public class MethodChallenge {
    public static void main(String[] args) {
    highScorePosition("Tim",calculateHighScorePosition(1500));
    highScorePosition("Bob",calculateHighScorePosition(999));
    highScorePosition("Tom",calculateHighScorePosition(499));
    highScorePosition("John",calculateHighScorePosition(99));
    highScorePosition("Joesph",calculateHighScorePosition(25));


    }
    public static void highScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName+" manged to get into position "+playerPosition+" on the high score list");

    }
    public static int calculateHighScorePosition(int score){
            if(score >= 1000) {
                return 1;
            } else if(score >= 500 && score < 1000){
                return 2;
            } else if(score >= 100 && score < 500){
                return 3;
            }
            return 4;
            /*
                        OR
                else{
                     return 4
                    }
             */
        /*
        Better Way to Right code
        int position = 4;
        if(score >= 1000) {
                position = 1;
            } else if(score >= 500){
                position = 2;
            } else if(score >= 100){
                position = 3;
            }
            return position
            */
    }

}
