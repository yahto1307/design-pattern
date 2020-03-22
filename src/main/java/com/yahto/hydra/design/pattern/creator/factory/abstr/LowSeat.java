package com.yahto.hydra.design.pattern.creator.factory.abstr;

/**
 * @author yahto
 * @date 3/22/2020
 */
public class LowSeat implements Seat {
    @Override
    public void massage() {
        System.out.println("massage support bad, or no massage");
    }
}
