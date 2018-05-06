package com.lhl.pattern.fatory.func;

import com.lhl.pattern.fatory.bean.Story;
import com.lhl.pattern.fatory.bean.ThreeBearsStory;

/**
 * Created by hongliang.liu on 2018/5/1.
 */
public class ThreeBearsFunFactory implements FunctionFactory {
    @Override
    public Story getStroy() {
        return new ThreeBearsStory();
    }
}
