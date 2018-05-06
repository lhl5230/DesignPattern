package com.lhl.pattern.singleton.test;

import com.lhl.pattern.singleton.serialize.Serialize;

import java.io.*;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class SerializeTest {
    public static void main(String[] args) {

        Serialize s1 = null;
        Serialize s2 = Serialize.getInstance();


        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            FileOutputStream out = new FileOutputStream("Serialize.obj");
            oos = new ObjectOutputStream(out);
            oos.writeObject(s2);

            FileInputStream in = new FileInputStream("Serialize.obj");
            ois = new ObjectInputStream(in);
            s1 = (Serialize)ois.readObject(); //这个方法里存在可能破坏单例的实现


            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2); //对象没写实现readResolve方法,就不会相等
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(oos != null)
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if( ois != null)
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
