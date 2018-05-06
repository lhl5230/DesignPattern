package com.lhl.pattern.singleton.test;

import com.lhl.pattern.singleton.register.RegisterSingleton;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class RegisterTest {
    public static void main(String[] args) {
        RegisterSingleton singleton = RegisterSingleton.getInstance("one");
        System.out.println(singleton);
        singleton = RegisterSingleton.getInstance("one");
        System.out.println(singleton);
        singleton = RegisterSingleton.getInstance("two");
        System.out.println(singleton);


    }
}
