package com.xubaorui.singleton;

/**
 * @author xbr
 * @Description 枚举式实现单例模式
 * 线程安全,调用效率高,没有实现延时加载!
 * @ClassName SingletonDemo5
 * @Date 2019/2/13
 * @Version 1.0
 * @since JDK 1.8
 */
public enum SingletonDemo5 {

    //这个枚举元素,本身就是单例对象!
    INSTANCE;

    public void singletonOperation() {
    }


}
