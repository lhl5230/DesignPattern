package com.lhl.pattern.singleton.serialize;

import java.io.Serializable;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class Serialize implements Serializable {
    private Serialize() {
    }

    private final static Serialize INSTANCE = new Serialize();

    public static Serialize getInstance() {
        return INSTANCE;
    }

    /**
     * 防止序列化时破坏单例
     * ObjectInputputStream的readObject--->readObject0--->readOrdinaryObject--->checkResolve
     * readOrdinaryObject中通过反射的方式调用无参构造方法新建一个对象。
     * invokeReadResolve:通过反射的方式调用要被反序列化的类的readResolve方法。
     * 序列化会通过反射调用无参数的构造方法创建一个新的对象。
     * @return
     */
//    private Object readResolve() {
//        return INSTANCE;
//    }
}
