package com.yahto.hydra.design.pattern.creator.factory.abstr;

/**
 * @author yahto
 * @date 3/22/2020
 */
public class TopTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("revolve fast");
    }
}
