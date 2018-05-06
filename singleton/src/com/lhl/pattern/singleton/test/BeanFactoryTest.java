package com.lhl.pattern.singleton.test;

import com.lhl.pattern.singleton.lazy.LazyThree;

import java.util.concurrent.CountDownLatch;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class BeanFactoryTest {
    public static void main(String[] args) {

        int count = 200;

        //模拟线程并发问题
        CountDownLatch latch = new CountDownLatch(count);
        long s = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread(){
                @Override
                public void run() {
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //并发会出现问题,有几率出现多个实例
//                    Object obj = BeanFactory.getInstance("com.lhl.pattern.singleton.test.Pojo");
//                    Object obj = LazyOne.getInstance();
//                    Object obj = LazyTwo.getInstance();

                    //没并发问题
                    Object obj = LazyThree.getInstance();
                    System.out.println(System.currentTimeMillis() + "==" + obj);
                }
            }.start();
            //每次启动一个线程，count --
            latch.countDown();
        }
        long e = System.currentTimeMillis();
        System.out.println("总耗时:" + (e - s));
    }
}
