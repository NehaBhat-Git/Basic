public class DoWhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        int j=1; //initialization
        while(j <= 5){  //can't initialize inside the while loop
             System.out.print(j+" ");
            j++;

        }
        System.out.println();
        int k=1;
        boolean isReady =false;
        do{
            if(k>5){
                break;
            }
            System.out.print(k+" ");
            k++;
            isReady =(k>0);

        }while (isReady);

        System.out.println();
        int number = 0;
        while(number < 50){
            number+= 5;
            if(number%25==0){
                continue;  //work like a break but not end the loop
            }
            System.out.print(number+" ");
        }

    }
}
