package org.vend.javaexamples.java8.lambdaexpressions;

public class LambdaExpression4 {

    interface FuncInter1 {
        int operation (int a , int b);
    }

    interface FuncInter2 {
        void sayMessage(String message);
    }

    private int operate(int a , int b, FuncInter1 fObj) {
        return fObj.operation(a,b);
    }

    public static void main(String args[]) {
        FuncInter1 add = (x, y) -> x + y;
        FuncInter1 mult = (x, y) -> x * y;

        LambdaExpression4 obj = new LambdaExpression4();

        System.out.println("Addition is: " + obj.operate(3,4,add));
        System.out.println("Multiplication is:" + obj.operate(6,6,mult));

        FuncInter2 funcObj = message -> System.out.println("Hello " + message);

        funcObj.sayMessage("Mehar");
    }
}
