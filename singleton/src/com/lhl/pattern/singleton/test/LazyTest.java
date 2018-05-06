package com.lhl.pattern.singleton.test;

import com.lhl.pattern.singleton.lazy.LazyThree;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class LazyTest {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 20000000; i++) {
//            LazyOne.getInstance();
//            LazyTwo.getInstance();
            LazyThree.getInstance();
        }

        System.out.println("总耗时:" + (System.currentTimeMillis() - s));
    }
}
