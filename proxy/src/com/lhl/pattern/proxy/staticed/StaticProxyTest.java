package com.lhl.pattern.proxy.staticed;

/**
 * 静态代理， 不方便扩展， Person接口加了方法，实现类（儿子）也需要实现，代理人也需要跟着加方法
 * Created by hongliang.liu on 2018/5/3.
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        //儿子想买吃的，叫父亲代理去买
        Father father = new Father(new Sun());

        father.buy();

        father.rentHouse();
    }
}
