package com.lhl.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Spring中用注册式单例
 * Created by hongliang.liu on 2018/5/3.
 */
public class BeanFactory {
    private BeanFactory() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        Object obj = ioc.get(className);
        if (obj == null)
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }

        return obj;
    }
}
