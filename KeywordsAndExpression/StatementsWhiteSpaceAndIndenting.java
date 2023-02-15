public class StatementsWhiteSpaceAndIndenting {
    public static void main(String[] args) {
        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");
        System.out.println("This is " +"another"+" still more.");
        System.out.println(myVariable);
        int myAnotherVaraible = 50; myVariable++; System.out.println("myVaraible= "+myVariable);

        /* What is WhatSpace
            Whitespace is any extra spacing, horizontally or vertically, placed around Java source code
            use for readable program
         */
        if(myVariable == 0){
            System.out.println("It's now Zero!");
        }
    }
}
