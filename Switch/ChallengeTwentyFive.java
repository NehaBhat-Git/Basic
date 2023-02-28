public class ChallengeTwentyFive {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount > goal){
            return false;
        }else if((bigCount < goal) && (smallCount > goal)){
            return true;
        }
        else if((bigCount < goal) && (smallCount < goal)){
            return true;
        }else if( bigCount == smallCount){
            return true;
        }
        return false;
    }
}
