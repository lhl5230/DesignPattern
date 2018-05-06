package com.lhl.pattern.proxy.jdk;

import com.lhl.pattern.proxy.Person;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();
        Person lhl = (Person) jdkProxy.getInstance(new Lhl());
        lhl.buy();
        lhl.rentHouse();
    }
}
