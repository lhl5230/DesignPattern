package com.lhl.pattern.fatory.abstr;

import com.lhl.pattern.fatory.bean.HareAndTortoiseStory;
import com.lhl.pattern.fatory.bean.Story;
import com.lhl.pattern.fatory.func.ThreeBearsFunFactory;

/**
 * Created by hongliang.liu on 2018/5/1.
 */
public class StoryFactory extends AbstractFactory {
    @Override
    public Story getThreeBearsStory() {
        return new ThreeBearsFunFactory().getStroy(); //方法工厂跟抽象工厂结合
    }

    @Override
    public Story getHareAndTortoiseStory() {
        return new HareAndTortoiseStory(); //单独的抽象工厂
    }
}
