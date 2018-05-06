package com.lhl.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 实现InvocationHandler是因为方法需要传递这个参数
 * Created by hongliang.liu on 2018/5/3.
 */
public class JdkProxy implements InvocationHandler {
    //被代理对象，引用保存下来
    private Lhl target;

    public Object getInstance(Lhl target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        //jdk代理， 底层是字节码重组实现
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是JDK代理");
        //执行原始对象的方法
        method.invoke(this.target, args);
        System.out.println("我代理完了");
        return null;
    }
}
