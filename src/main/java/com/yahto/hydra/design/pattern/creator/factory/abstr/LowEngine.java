package com.yahto.hydra.design.pattern.creator.factory.abstr;

/**
 * @author yahto
 * @date 3/22/2020
 */
public class LowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("low engine, run slow");
    }

    @Override
    public void start() {
        System.out.println("low engine, run slow");
    }
}
