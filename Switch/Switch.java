/*
    switch(value){
        case x:
            //code for value == x
            break;
        case y:
            //code for value == y;
            break;
        default:
            //code for value not equal to x or y
            break;
       }
      Valid Data type to use Switch
      byte, short,int,char
      string
      enum

      Can't use: Boolean,long,float,double
 */
public class Switch {
    public static void main(String[] args) {
//        int value =3;
//        if(value == 1){
//            System.out.println("Value is 1");
//        } else if (value == 2) {
//            System.out.println("Value is 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
        // By using switch value
/*
        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a "+switchValue);
                break;
            default:
                System.out.println("was not 1,2,3,4 or 5");
                break;
        } */
        int switchValue = 2;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("was 3,4,or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1,2,3,4, or 5");
        }
        System.out.println("after this value, will print");
        String month = "A";
        System.out.println(month+" is a "+getMonth(month)+" quarter");
    }
    public static String getMonth(String month){
        return switch (month) {
            case "January", " February", " March" -> { yield  "1st";}
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
               String badResponse = month+" is bad";
               yield badResponse;
            }
        };
    }
}
