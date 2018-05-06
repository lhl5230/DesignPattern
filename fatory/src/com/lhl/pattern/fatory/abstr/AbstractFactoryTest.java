package com.lhl.pattern.fatory.abstr;

/**
 * Created by hongliang.liu on 2018/5/1.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        StoryFactory factory = new StoryFactory();
        System.out.println(factory.getHareAndTortoiseStory());
        System.out.println(factory.getThreeBearsStory());
    }
}
