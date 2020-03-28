package com.yahto.hydra.design.pattern.creator.decorator;

/**
 * @author yahto
 * @date 3/22/2020
 */
public class CarDecorator implements CarComponent{

    protected CarComponent carComponent;

    public CarDecorator(CarComponent carComponent) {
        super();
        this.carComponent = carComponent;
    }

    @Override
    public void move() {
        carComponent.move();
    }
}
