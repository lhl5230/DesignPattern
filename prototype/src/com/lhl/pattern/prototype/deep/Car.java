package com.lhl.pattern.prototype.deep;

import java.io.*;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class Car implements Cloneable, Serializable {
    public Wheel wheel;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepCopy();
    }

    /**
     * 深复制
     * @return
     */
    private Object deepCopy() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
