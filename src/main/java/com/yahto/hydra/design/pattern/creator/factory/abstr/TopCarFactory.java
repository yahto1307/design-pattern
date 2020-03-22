package com.yahto.hydra.design.pattern.creator.factory.abstr;

/**
 * @author yahto
 * @date 3/22/2020
 */
public class TopCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new TopEngine();
    }

    @Override
    public Seat createSeat() {
        return new TopSeat();
    }

    @Override
    public Tyre createTyre() {
        return new TopTyre();
    }
}
