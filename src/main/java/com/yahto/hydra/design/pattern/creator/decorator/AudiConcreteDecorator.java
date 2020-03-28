package com.yahto.hydra.design.pattern.creator.decorator;

/**
 * @author yahto
 * @date 3/22/2020
 */
public class AudiConcreteDecorator extends CarDecorator {
    public AudiConcreteDecorator(CarComponent carComponent) {
        super(carComponent);
    }

    public void fly(){
        //定义自己的行为
        System.out.println("flying..");
    }

    @Override
    public void move() {
        //行为组合
        fly();
        super.move();
    }
}
