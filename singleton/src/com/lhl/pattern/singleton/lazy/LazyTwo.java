package com.lhl.pattern.singleton.lazy;

/**
 * 懒汉式2
 * Created by hongliang.liu on 2018/5/2.
 */
public class LazyTwo {
    private LazyTwo() {
    }

    private static LazyTwo lazy = null;

    /**
     * 加锁解决线程安全问题,但影响效率
     * @return
     */
    public static synchronized LazyTwo getInstance() {
        if (lazy == null)
            lazy = new LazyTwo();
        return lazy;
    }
}
