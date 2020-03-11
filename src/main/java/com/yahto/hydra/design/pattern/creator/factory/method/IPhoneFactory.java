package com.yahto.hydra.design.pattern.creator.factory.method;

/**
 * 抽象手机工厂
 *
 * @author yahto
 * @date 2020/3/11 4:09 PM
 */
public interface IPhoneFactory {

    /**
     * 造手机
     *
     * @param type 手机类型 apple->appleIphone,samsung->samsungIphone
     * @return 手机
     * @throws Exception 创建不成功
     */
    IPhone phone(String type) throws Exception;

}
