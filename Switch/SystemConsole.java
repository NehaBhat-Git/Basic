
/*
    Wrapper            Wrapper Method
    Integer            parseInt(String)
    Double             parseDouble(String)
 */

import java.util.Scanner;

public class SystemConsole {
    public static void main(String [] args){
        int currentYear = 2022;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

//        String userDataOfBirth = "1999";
//
//        int dateofBirth = Integer.parseInt(userDataOfBirth);
//
//        System.out.println("Age = "+(currentYear - dateofBirth));
//
//        String userAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
//        System.out.println("Partial Age: "+(ageWithPartialYear));

    }
    /*
        This method is used to run he programs in console
     */
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi "+name+", Thanks for taking the course! ");

        String dateOfbirth = System.console().readLine("What year were you born: ");
        int age = currentYear - Integer.parseInt(dateOfbirth);

        return "So you are "+age+" year old";
    }
    public static  String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();

        System.out.println("Hi "+name+", Thanks for taking the course! ");

        System.out.println("What year were you born ?");
        String dateOfbirth = scanner.nextLine();

        int age = currentYear - Integer.parseInt(dateOfbirth);

        return "So you are "+age+" year old";

    }
}
