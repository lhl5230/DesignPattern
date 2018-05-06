package com.lhl.pattern.fatory.func;

import com.lhl.pattern.fatory.bean.HareAndTortoiseStory;
import com.lhl.pattern.fatory.bean.Story;

/**
 * Created by hongliang.liu on 2018/5/1.
 */
public class HareTortoiseFunFactory implements FunctionFactory {
    @Override
    public Story getStroy() {
        return new HareAndTortoiseStory();
    }
}
