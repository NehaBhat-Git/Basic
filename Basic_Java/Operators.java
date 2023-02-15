/* Operators in Java are special that perform specific operations in one , two or three operands, and then return a result
    E.g : + (addition) operator to sum the value of two variables

    Operand is a term used to describe any object that is manipulated by an operator.
    int myVar = 15 + 2;
    + is operator
    15, 12 is operands
    15+12 is the expression which has(or return) 27 in this case
*/
public class Operators {
    public static void main( String[] args){
        int result = 3; // 1+2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = "+result);
        result = result - 1;   // 3-1 =2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = "+result);

        result = result * 20;  // 2*20 = 40
        System.out.println("2 * 20 = "+result);

        result = result / 10;  // 40/10 = 4
        System.out.println("40 / 10 = "+result);

        result = result % 3;  // remainder of (4 % 3) = 1
        System.out.println("4 % 3 = "+result);

        // ABBREVIATED OPERATORS

        // result = result + 1;
        result++;  // 1+1=2;
        System.out.println("1 + 1 = "+result);

        result--; // 2-1 = 1;
        System.out.println("2 - 1 = "+result);

        // result = result + 2;
        result+= 2;
        System.out.println("1 + 2 = "+result);

        // result = result * 10;
        result*= 10;
        System.out.println("3 * 10 = "+result);

        //result = result / 5;
        result/= 5;
        System.out.println("30 / 5 = "+result);

        //result = result - 3;
        result-= 3;
        System.out.println("6 - 3 = "+result);

        // result = result % 3;
        result%= 3;
        System.out.println("3 % 3 = "+result);


    }
}
