package com.yahto.hydra.design.pattern.creator.factory.simple;

/**
 * 奥迪车
 * @author yahto
 * @date 2020/3/11 3:50 PM
 */
public class Audi implements ICar {
    @Override
    public void drive() {
        System.out.println("audi 跑起来");
    }

    @Override
    public void stop() {
        System.out.println("audi 停下来");
    }
}
