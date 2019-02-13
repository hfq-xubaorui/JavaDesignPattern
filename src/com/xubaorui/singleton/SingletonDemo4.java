package com.xubaorui.singleton;

/**
 * @author xbr
 * @Description 静态内部类
 * 线程安全,调用效率高,并实现了延时加载!
 * @ClassName SingletonDemo4
 * @Date 2019/2/13
 * @Version 1.0
 * @since JDK 1.8
 */
public class SingletonDemo4 {

    private static class SingletonClassInstance {
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    public static SingletonDemo4 getInstance() {
        return SingletonClassInstance.instance;
    }

    //构造器私有化
    private SingletonDemo4() {
    }
}
