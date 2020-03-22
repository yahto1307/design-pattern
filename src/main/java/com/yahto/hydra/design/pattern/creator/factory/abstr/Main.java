package com.yahto.hydra.design.pattern.creator.factory.abstr;

/**
 * @author yahto
 * @date 3/22/2020
 */
public class Main {

    public static void main(String[] args) {
        CarFactory carFactory  = new TopCarFactory();
        Engine engine = carFactory.createEngine();
        Seat seat = carFactory.createSeat();
        Tyre tyre = carFactory.createTyre();

        engine.run();
        engine.start();
        seat.massage();
        tyre.revolve();
    }
}
