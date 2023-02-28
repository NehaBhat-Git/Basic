/*
    STEP 1:
    create a method name isEvenNumber, takes a parameter of type init
    It's purpose is to determine if argument passes to the method is an even number or not
    return true from the method, if it's an even number, otherwise return false
    Next, use a while loop to test a range of numbers, from 5, up to and including 20, but printing out only the even numbers,
    determined by the call to the isEvenNumber method.

    STEP 2:
    Make it also record the total number of even number it has found
    Break out of the loop, once 5 even numbers are found
    finally, display the total number of odd and even numbers found.

 */
public class DoWhileChallenge {
    public static void main(String[] args) {
        //System.out.println(isEvenNumber(5));
        int firstrange=5;
        int lastrange=20;
        int sumEven = 0;
        int evenCount = 0;
        int oddCount =0;

        if((firstrange <5) || (lastrange > 20)){
            System.out.println("Not in a range");
        }
        System.out.print("Even number is: ");
        while((firstrange <= lastrange)){

            if(isEvenNumber(firstrange)){
                sumEven+= firstrange;
                System.out.print(firstrange+" ");
                evenCount++;
                if(evenCount == 5){
                    break;
                }
            }
                if(!isEvenNumber(firstrange)){
                    oddCount++;
                }
            firstrange++;
        }
        System.out.println("\nCount of even number is: "+evenCount);
        System.out.println("Count of odd number is: "+oddCount);
        System.out.println("Sum of even number is: "+sumEven);
    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
}
