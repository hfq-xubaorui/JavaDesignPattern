package com.xubaorui.singleton;

/**
 * @author xbr
 * @Description 双重检查锁
 * @ClassName SingletonDemo3
 * @Date 2019/2/13
 * @Version 1.0
 * @since JDK 1.8
 */
public class SingletonDemo3 {

    //类初始化时,不初始化此对象(延时加载,真正用的时候再创建)
    private static SingletonDemo3 instance = null;

    //构造器私有化
    private SingletonDemo3() {
    }

    //由于编译器优化原因和JVM底层内部模型的原因,偶尔会出问题.不建议使用
    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            SingletonDemo3 sc;
            synchronized (SingletonDemo3.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletonDemo3.class) {
                        if (sc == null) {
                            sc = new SingletonDemo3();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }

}
