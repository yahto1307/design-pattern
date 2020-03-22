package com.yahto.hydra.design.pattern.creator.factory.abstr;

/**
 * @author yahto
 * @date 3/22/2020
 */
public class TopEngine implements Engine {
    @Override
    public void run() {
        System.out.println("top engine, run fast");
    }

    @Override
    public void start() {
        System.out.println("top engine, start fast");
    }
}
