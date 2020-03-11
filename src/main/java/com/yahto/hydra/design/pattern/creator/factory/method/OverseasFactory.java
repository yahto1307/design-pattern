package com.yahto.hydra.design.pattern.creator.factory.method;

/**
 * @author yahto
 * @date 2020/3/11 4:19 PM
 */
public class OverseasFactory implements IPhoneFactory {
    @Override
    public IPhone phone(String type) throws Exception {
        if ("apple".equals(type)) {
            System.out.println("made in 国外厂家");
            return new AppleIphone();
        }
        if ("samsung".equals(type)) {
            System.out.println("made in 国外厂家");
            return new SamsungIphone();
        }
        throw new RuntimeException("不支持的手机品牌");
    }
}
