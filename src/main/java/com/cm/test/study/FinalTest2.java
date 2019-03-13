package com.cm.test.study;

public class FinalTest2 {

    public interface Converter<T1, T2> {
        void convert(int i);
    }

    public static void main(String[] args) {
        // 这里可以不用final修似，但是后面不能做修改
        int num = 1;
        Converter<Integer, String> s = (i -> System.out.println(String.valueOf(i + num)));
        s.convert(2);
        // num = 2;
    }
}
