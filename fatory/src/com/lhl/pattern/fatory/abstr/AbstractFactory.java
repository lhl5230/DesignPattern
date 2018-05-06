package com.lhl.pattern.fatory.abstr;

import com.lhl.pattern.fatory.bean.Story;

/**
 * 抽象工厂,
 * 易于扩展， 只需要告知别人增加了的接口
 * 可以有其他的逻辑实现
 * Created by hongliang.liu on 2018/5/1.
 */
public abstract class AbstractFactory {

    //其他逻辑

    /**
     * 获取三只小熊的故事
     * @return
     */
    public abstract Story getThreeBearsStory();

    /**
     * 获取龟兔赛跑的故事
     * @return
     */
    public abstract Story getHareAndTortoiseStory();

    //如果需要增加其他故事，直接在此添加抽象， 实现类中实现
}
