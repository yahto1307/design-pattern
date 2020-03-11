package com.yahto.hydra.design.pattern.creator.factory.simple;

/**
 * @author yahto
 * @date 2020/3/11 3:54 PM
 */
public class CarSimpleFactory {

    public static ICar car(String carName) throws Exception {
        if ("benz".equals(carName)) {
            return new Benz();
        }
        if ("audi".equals(carName)) {
            return new Audi();
        }
        if ("bmw".equals(carName)) {
            return new Bmw();
        }
        throw new RuntimeException("没有当前车型");
    }

}
