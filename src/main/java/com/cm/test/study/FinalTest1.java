package com.cm.test.study;

public class FinalTest1 {

    // lambda 表达式只能引用标记了 final 的外层局部变量
    final static String salutation = "Hello! ";

    interface GreetingService{
        void sayMessage(String message);
    }

    public static void main(String[] args) {
        GreetingService greetingService = message -> {
            System.out.println(salutation + message);
        };
        greetingService.sayMessage("Runoob!");



    }


}
