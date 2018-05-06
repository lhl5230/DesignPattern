package com.lhl.pattern.proxy.staticed;

import com.lhl.pattern.proxy.Person;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class Sun implements Person {
    @Override
    public void buy() {
        System.out.println("想买各种好吃的");
    }

    @Override
    public void rentHouse() {
        System.out.println("租180平大房");
    }
}
