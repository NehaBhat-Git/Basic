public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double kilometers = (100 * 1.60736);
        System.out.println(kilometers);

        int highScore = 50;

        if(highScore > 25)
        {
            highScore = 1000 + highScore;  //add bonus points
        }
         /*How many expression are there in this statement
            Ans --> Total 6 expression are there
               highScore = 100, health < 25 , highScore > 1000 ,health < 25 )  && (highScore > 1000 (because && operator this there)
                highScore - 1000, highScore = highScore - 1000

             */
        int health = 100;

        if((health < 25 )  && (highScore > 1000)){
            highScore = highScore - 1000;

        }
    }
}