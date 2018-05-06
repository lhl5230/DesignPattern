package com.lhl.pattern.fatory.simple;

import com.lhl.pattern.fatory.bean.ThreeBearsStory;

/**
 * Created by hongliang.liu on 2018/5/1.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //一般方法，new实际对象
        System.out.println(new ThreeBearsStory().getName());

        //使用简单的工厂，需要人工传入名称，扩展时需要用户知道具体名称内容
        //儿子告诉我要听三只小熊的故事，就传入三只小熊给我，我就给他讲这个故事
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getStory("三只小熊"));
        System.out.println(factory.getStory("龟兔赛跑"));
        System.out.println(factory.getStory("猫和老鼠"));
    }
}
