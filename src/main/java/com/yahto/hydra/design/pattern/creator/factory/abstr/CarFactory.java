package com.yahto.hydra.design.pattern.creator.factory.abstr;

/**
 * @author yahto
 * @date 3/22/2020
 */
public interface CarFactory {

    /**
     * create engine
     *
     * @return engine
     */
    Engine createEngine();

    /**
     * create seat
     *
     * @return seat
     */
    Seat createSeat();


    /**
     * create tyre
     *
     * @return tyre
     */
    Tyre createTyre();

}
