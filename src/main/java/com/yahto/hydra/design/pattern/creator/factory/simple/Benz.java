package com.yahto.hydra.design.pattern.creator.factory.simple;

/**
 * 奔驰车
 *
 * @author yahto
 * @date 2020/3/11 3:52 PM
 */
public class Benz implements ICar {
    @Override
    public void drive() {
        System.out.println("benz 跑起来");
    }

    @Override
    public void stop() {
        System.out.println("benz 停下来");
    }
}
