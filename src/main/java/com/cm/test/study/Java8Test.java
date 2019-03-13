package com.cm.test.study;

public class Java8Test {
    public static void main(String[] args) {
        Java8Test test = new Java8Test();
        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        // 不声明
        MathOperation substraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {return a * b;};

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a/b;

        System.out.println("10 + 5 = " + test.operate(10, 5, addition));
        System.out.println("10 - 5 = " + test.operate(10, 5, substraction));
        System.out.println("10 x 5 = " + test.operate(10, 5 ,multiplication));
        System.out.println("10 / 5 = " + test.operate(10, 5, division));


        /**
         *
         * Lambda 表达式主要用来定义行内执行的方法类型接口
         * 我们使用各种类型的Lambda表达式来定义MathOperation接口的方法。
         * 然后我们定义了sayMessage的执行。
         *
         * */

        // 不用括号
        GreetingService greetingService1 = message ->
            System.out.println("hello" + message);
        // 用括号
        GreetingService greetingService2 = (message -> System.out.println("hello" + message));

        greetingService1.sayMessage("Runoob");
        greetingService2.sayMessage("Google");
    }



    interface MathOperation{
        int operation(int a, int b);
    }
    interface GreetingService{
        void sayMessage(String message);
    }
    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
