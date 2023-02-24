/*
Convert the following if-else-if construct into switch case:
if(var == 1)
System.out.println("good");
else if(var == 2)
System.out.println("better");
else if(var == 3)
System.out.println("best");
else
System.out.println("invalid");

 */

public class ConvertIfelseintoSwitch{
    public static void main(String[] args){
        int var = 1;
        switch(var) {
            case 1:
                System.out.println("good");
                break;
            case 2:
                System.out.println("better");
                break;
            case 3:
                System.out.println("best");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
