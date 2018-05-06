package com.lhl.pattern.proxy.cglib;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        CglibVo vo = (CglibVo) new CglibProxy().getInstance(CglibVo.class);
        vo.buy();
        vo.rentHouse();
    }
}
