package com.lhl.pattern.fatory.simple;

import com.lhl.pattern.fatory.bean.HareAndTortoiseStory;
import com.lhl.pattern.fatory.bean.Story;
import com.lhl.pattern.fatory.bean.ThreeBearsStory;

/**
 * 简单的工厂
 * Created by hongliang.liu on 2018/5/1.
 */
public class SimpleFactory {

    /**
     * 根据名称获取故事种类，需要用户传入对应的名称
     *
     * @param name
     * @return
     */
    public Story getStory(String name) {
        if ("三只小熊".equals(name))
            return new ThreeBearsStory();
        else if ("龟兔赛跑".equals(name))
            return new HareAndTortoiseStory();
        else {
            System.out.println("没有听过这个故事");
            return null;
        }

    }
}
