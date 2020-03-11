package com.yahto.hydra.design.pattern.creator.factory.method;

/**
 * @author yahto
 * @date 2020/3/11 4:03 PM
 */
public class Main {
    private IPhoneFactory iPhoneFactory;

    public Main(IPhoneFactory iPhoneFactory) {
        this.iPhoneFactory = iPhoneFactory;
    }

    public static void main(String[] args) throws Exception {
        Main main1 = new Main(new ChinaFactory());
        IPhone iPhone1 = main1.iPhoneFactory.phone("apple");
        iPhone1.call();
        iPhone1.endCall();

        Main main2 = new Main(new OverseasFactory());
        IPhone iPhone2 = main2.iPhoneFactory.phone("samsung");
        iPhone2.call();
        iPhone2.endCall();
    }
}
