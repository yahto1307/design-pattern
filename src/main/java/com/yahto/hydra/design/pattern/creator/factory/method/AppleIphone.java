package com.yahto.hydra.design.pattern.creator.factory.method;

/**
 * @author yahto
 * @date 2020/3/11 4:12 PM
 */
public class AppleIphone implements IPhone {
    @Override
    public void call() {
        System.out.println("apple iphone 打电话");
    }

    @Override
    public void endCall() {
        System.out.println("apple iphone 挂电话");
    }
}
