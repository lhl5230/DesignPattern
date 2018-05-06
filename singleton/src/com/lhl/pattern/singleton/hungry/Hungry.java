package com.lhl.pattern.singleton.hungry;

/**
 * 饿汉式
 * 类初始化时就加载，线程安全的，但不管用没用hungry都占用空间
 * Created by hongliang.liu on 2018/5/2.
 */
public class Hungry {
    private Hungry() {
    }

    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }
}
