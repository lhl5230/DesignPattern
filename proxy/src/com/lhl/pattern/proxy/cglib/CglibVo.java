package com.lhl.pattern.proxy.cglib;

/**
 * cglib代理不需要实现接口
 * Created by hongliang.liu on 2018/5/3.
 */
public class CglibVo {

    public void buy() {
        System.out.println("CGLIB 买东西");
    }


    public void rentHouse() {
        System.out.println("CGLIB 租房子");
    }
}
