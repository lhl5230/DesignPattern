package com.lhl.pattern.fatory.func;

/**
 * Created by hongliang.liu on 2018/5/1.
 */
public class FunctionFactoryTest {
    public static void main(String[] args) {
        /**
         * 用具体的实现工厂去实现
         */
        FunctionFactory factory = new HareTortoiseFunFactory();
        System.out.println(factory.getStroy());
        factory = new ThreeBearsFunFactory();
        System.out.println(factory.getStroy());
    }
}
