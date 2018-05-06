package com.lhl.pattern.singleton.lazy;

/**
 * 懒汉式3, 用静态内部类解决线程安装和效率问题
 * 内部类
 * Created by hongliang.liu on 2018/5/3.
 */
public class LazyThree {
    private LazyThree() {
        System.out.println("外部类初始化");
    }

    public static final LazyThree getInstance() {
        return LazyInner.lazy;
    }

    static class LazyInner {
        public static final LazyThree lazy = new LazyThree();
        static {
            System.out.println("内部类初始化");
        }
    }


}
