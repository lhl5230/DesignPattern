package com.lhl.pattern.prototype.deep;

/**
 * Created by hongliang.liu on 2018/5/3.
 */
public class DeepCopyTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.wheel = new Wheel();

        try {
            Car targetCar = (Car) car.clone();
            System.out.println(car.wheel == targetCar.wheel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
