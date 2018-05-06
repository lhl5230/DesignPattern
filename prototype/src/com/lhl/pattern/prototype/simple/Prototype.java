package com.lhl.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/** 浅复制
 * Created by hongliang.liu on 2018/5/3.
 */
public class Prototype implements Cloneable {
    private String name;
    public List<CloneTarget> list = new ArrayList<>();
    public CloneTarget target;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
