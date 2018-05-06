package com.lhl.pattern.fatory.func;

import com.lhl.pattern.fatory.bean.Story;

/** 方法工厂，用更具体的工厂来获取对应的故事，各自的工厂去实现
 * Created by hongliang.liu on 2018/5/1.
 */
public interface FunctionFactory {
    Story getStroy();
}
