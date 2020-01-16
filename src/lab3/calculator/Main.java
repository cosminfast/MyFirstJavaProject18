package lab3.calculator;

import lab3.calculator.LogicalOp;

public class Main {



    public static void main(String[] args) {

        //1.Given two numbers,
        // see which one is the
        // greatest and print it
        int x = 3;
        int y = 8;

        LogicalOp op = new LogicalOp();
//        System.out.println(op.verifyGreaterNumber(x,y));

//      2.Given a text input,
//      if it is “FastTrack”,
//      then print “Learning text comparison”.
//      If not, print “Got to try some more”

        String text = "FastTrack";
        String text2 = "Teasdast";
//        String text2 = new String("FastTrackIt");
        String result = op.verifyText(text,text2);
        System.out.println(result);

    }

}
