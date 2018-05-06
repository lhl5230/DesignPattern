package com.lhl.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册模式单例
 * Created by hongliang.liu on 2018/5/3.
 */
public class RegisterSingleton {
    private static Map<String, RegisterSingleton> register = new ConcurrentHashMap<String, RegisterSingleton>(); //接收注册的集合

    private RegisterSingleton() {
    }

    public static RegisterSingleton getInstance(String name) {
        if(name == null)
            name = RegisterSingleton.class.getName();

        RegisterSingleton singleton = register.get(name);
        if (singleton == null) {
            singleton = new RegisterSingleton();
            register.put(name, singleton);
        }
        return singleton;
    }
}
