package com.yahto.hydra.design.pattern.creator.factory.abstr;

/**
 * @author yahto
 * @date 3/22/2020
 */
public class LowCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
