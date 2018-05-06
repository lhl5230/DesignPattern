package com.lhl.pattern.prototype.simple;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class CloneTest {
    public static void main(String[] args) {
        CloneTarget target = new CloneTarget();
        target.setName("lhl");
//        prototype.list.add("a");
//        prototype.list.add("b");
        target.list.add(new CloneTarget());
        target.target = new CloneTarget();

        System.out.println(target.list.get(0));
        try {
            CloneTarget cloneTarget = (CloneTarget) target.clone();
            System.out.println(cloneTarget.list.get(0));
            System.out.println(target == cloneTarget);
            //对象也复制，引用相同
            System.out.println(cloneTarget.target == target.target);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
