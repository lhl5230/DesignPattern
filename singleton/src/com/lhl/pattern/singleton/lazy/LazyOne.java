package com.lhl.pattern.singleton.lazy;

/**
 * 懒汉式1
 * 只有用到时才实例化
 * 线程不安全
 * Created by hongliang.liu on 2018/5/2.
 */
public class LazyOne {
    private LazyOne() {}

    private static LazyOne lazy = null;

    public static LazyOne getInstance() {
        if (lazy == null)
            lazy = new LazyOne();
        return lazy;
    }
}
