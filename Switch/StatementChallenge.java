public class StatementChallenge {
    public static void main(String[] args) {
    System.out.println("0 is "+(isPrime(0)? "":"NOT ")+"a prime number");
    System.out.println("1 is "+(isPrime(1)? "":"NOT ")+"a prime number");
    System.out.println("2 is "+(isPrime(2)? "":"NOT ")+"a prime number");
    System.out.println("3 is "+(isPrime(3)? "":"NOT ")+"a prime number");

        System.out.println("8 is "+(isPrime(8)? "":"NOT ")+"a prime number");
        System.out.println("17 is "+(isPrime(17)? "":"NOT ")+"a prime number");

    }
    public static boolean isPrime(int number){
        if(number<=2){
           return (number == 2);
        }
        for(int divisor = 2; divisor <=number/2; divisor++){
            if(number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
