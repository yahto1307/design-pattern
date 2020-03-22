package com.yahto.hydra.design.pattern.creator.factory.simple;

/**
 * 宝马
 *
 * @author yahto
 * @date 2020/3/11 3:53 PM
 */
public class Bmw implements ICar {
    @Override
    public void drive() {
        System.out.println("bmw 跑起来");
    }

    @Override
    public void stop() {
        System.out.println("bmw 停下来");
    }
}
