package com.lhl.pattern.proxy.jdk;

import com.lhl.pattern.proxy.Person;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class Lhl implements Person {
    @Override
    public void buy() {
        System.out.println("买各种家用品");
    }

    @Override
    public void rentHouse() {
        System.out.println("三室一厅");
    }
}
