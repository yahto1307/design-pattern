package com.yahto.hydra.design.pattern.creator.factory.simple;

/**
 * @author yahto
 * @date 2020/3/11 3:41 PM
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ICar car = CarSimpleFactory.car("benz");
        car.drive();
        car.stop();
    }
}
