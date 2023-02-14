/* Primitive data type
There are 8 datatype are those datatype are:
            (int,float,char,double,byte,long,short,boolean)
These are the reserved keywords and can't be used as a keywords

Size of Primitive Type
DataType              Byte          Bits
Byte                    1             8
Boolean                 -             1
Short                   2             16
int                     4             32
float                   4             32
double                  8             64
Long                    8             64


 */
public class PrimitiveType {
    public static void main(String [] args){
            int myValue = 10000;
            int myMaxIntValue = Integer.MAX_VALUE;
            int myMinIntValue = Integer.MIN_VALUE;
            System.out.println("Integer value ("+Integer.MAX_VALUE+" to "+Integer.MIN_VALUE+")");
            System.out.println("OverFLow Max and UnderFlow Min value are: "+(myMaxIntValue+1)+" to "+(myMinIntValue-1));

            //Byte Primitive data type
            byte myMaxByteValue = Byte.MAX_VALUE;
            byte myMinByteValue = Byte.MIN_VALUE;

            System.out.println("Byte Max and Min ("+Byte.MAX_VALUE+" to "+Byte.MIN_VALUE +")");

            //short Primitive Data type
            short myMaxShortValue = Short.MAX_VALUE;
            short myMinShortValue = Short.MIN_VALUE;

            System.out.println("Short Max and Min Value ("+Short.MAX_VALUE+ " to "+Short.MIN_VALUE+")");

            //long Primitive data type
            long myLongValue = 100L;  //use L in the end of value because computer consider it as an Int Value;
            long myMaxLongValue = Long.MAX_VALUE;
            long myMinLongValue = Long.MIN_VALUE;
            System.out.println("Long Value of Max and Min is:"+myMaxLongValue+" "+myMinLongValue);

            int myTotal = myMaxIntValue / 2;

            byte myTotalByte = (byte) (myMaxByteValue / 2);
            System.out.println(myTotalByte);

            short myTotalShort = (short) (myMaxShortValue / 2);
            System.out.println(myTotalShort);

            //Challenge
            byte myByteNum = 101;
            short myShortNum = 20001;
            int myIntNum = 1001;

            long myLongNum = 50000L + 10L * (myByteNum + myShortNum + myIntNum);
            System.out.println(myLongNum);

            short shortTotal = (short) (1000 + 10* (myByteNum + myShortNum + myIntNum));
            System.out.println(shortTotal);

            /*FLOAT AND DOUBLE PRIMITIVE TYPE
            Floating Point number have fractional parts that we express with a decimal point
            3.14159 is an example
             */
            float myFloatMaxValue = Float.MAX_VALUE;
            float myFloatMinValue = Float.MIN_VALUE;
            System.out.println("Float Max value "+myFloatMaxValue);
            System.out.println("Float Min value "+myFloatMinValue);

            double myDoubleMaxValue = Double.MAX_VALUE;
            double myDoubleMinValue = Double.MIN_VALUE;
            System.out.println("Double Max value "+myDoubleMaxValue);
            System.out.println("Double Min value "+myDoubleMinValue);

            int myIntValue = 5/3;
            float myFloatValue = 5f / 3f; //OR
            //float myFloatValue = (float) 5.32;
            double myDoubleValue = 5d/ 3d;

            System.out.println("MyIntValue= "+myIntValue);
            System.out.println("MyFLoatValue= "+myFloatValue);
            System.out.println("MyDoubleValue= "+myDoubleValue);





            






    }
}
