public class ChallengeTwentyThree {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(6));
    }
    public static boolean isPerfectNumber(int number){
        if(number <1){
            return false;
        }
        int i;
        int sum =0;
        for(i=1;i<=number/2;i++){
            if(number%i==0){

                sum+= i;
            }
        }
        if(sum == number){
            return true;
        }else {
            return false;
        }
    }
}
