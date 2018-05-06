package com.lhl.pattern.proxy.staticed;

import com.lhl.pattern.proxy.Person;

/**
 * 静态代理， 不方便扩展， 儿子加了方法，代理人也需要跟着加
 * Created by hongliang.liu on 2018/5/3.
 */
public class Father {
    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void buy() {
        //处理自己的逻辑
        System.out.println("代买人穿衣服出门");
        this.person.buy();
        System.out.println("代买人买回来吃的");
    }

    public void rentHouse() {
        System.out.println("存钱");
        this.person.rentHouse();
        System.out.println("适不适合");
    }
}
