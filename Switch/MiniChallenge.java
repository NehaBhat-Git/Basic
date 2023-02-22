public class MiniChallenge {
    public static void main(String[] args) {
        for(double rate = 7.5; rate<= 10.0; rate+=0.25){
            if(rate > 8.5)
                break;
            System.out.println("100.0 at "+rate+"% interest = $"+calculateInterest(100,rate));
        }


    }
    public static double calculateInterest (double amount, double interestRate){
        return (amount*(interestRate /100));
    }
}
