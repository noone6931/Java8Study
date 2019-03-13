package com.cm.test.study;
/**
 * 使用lanmda实现runnable接口
 * */
public class RunnableTest {
    public static void main(String[] args) {
        // 1.1 使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("helloworld");
            }
        }).start();

        // 1.2 使用lambda
        new Thread(() -> System.out.println("helloworld")).start();

        // 2.1 使用匿名内部类
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world!");
            }
        };

        // 2.2 使用lambda
        Runnable race2 = ()-> System.out.println("hellowold!");

        race1.run();
        race2.run();
    }
}
