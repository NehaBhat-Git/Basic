public class Strings {
    public static void main(String[] args) {
        /* String is a datatype in Java which is not a primitive data type
        It's actually a class, but it enjoys a bit of favoritism in Java to make it easier to use than a regular class.

        String is a sequence of character.String is java is Immutable. That means you can't change a string after it's created.
        Instead, what happens is new String is created.
         */
    String myString = " This is a string";
    System.out.println("myString is equal to : "+myString);
    myString = myString +" , and this is more.";
    System.out.println("myString is equal to : "+myString);
    myString = myString +" \u00A9 2019";
    System.out.println("myString is equal to : "+myString);

    String numberString = "250.55";
    numberString = numberString + "49.55";
    System.out.println(numberString);

    String lastString = "10";
    int myInt = 50;
    lastString = lastString + myInt;
    System.out.println("LastString is equal to "+lastString);

    double doubleNumber = 120.55d;
    lastString = lastString +doubleNumber;
    System.out.println("LastString is equal to "+lastString);











    }
}
