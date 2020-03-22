package com.yahto.hydra.design.pattern.creator.factory.method;

/**
 * @author yahto
 * @date 2020/3/11 4:14 PM
 */
public class SamsungIphone implements IPhone {
    @Override
    public void call() {
        System.out.println("samsung iphone 打电话");
    }

    @Override
    public void endCall() {
        System.out.println("samsung iphone 挂电话");
    }
}
