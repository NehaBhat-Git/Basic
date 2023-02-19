/*
    Method OverLoading occurs when a class has multiple  methods, with the same name, but methods are declared with different parameters.
    So we can execute a method with one name, but it should have different arguments

    Java resolve which method it needs to execute  based on arguments being passed, when the method is invoked.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("New score is "+calculateScore("Tim", 500));
        System.out.println("New score is "+calculateScore(10));

    }
    public static int calculateScore (String playerName, int score){
        System.out.println("Player "+playerName+" scored "+ score + " points");
        return score * 1000;
    }
    //Method Overloading with different parameters
    public static int calculateScore (int score){
        return  calculateScore("Anonymous", score);
    }
    //Method Overloading with zero parameters
    public static int calculateScore (){
        System.out.println("No player name, no score!");
        return 0;
    }

}
