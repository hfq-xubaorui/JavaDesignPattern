package com.xubaorui.singleton;

/**
 * @author xbr
 * @Description 懒汉式
 * @ClassName SingletonDemo2
 * @Date 2019/2/13
 * @Version 1.0
 * @since JDK 1.8
 */
public class SingletonDemo2 {

    //类初始化时,不初始化这个对象(延时加载,真正用的时候再创建).
    private static SingletonDemo2 s;

    //构造器私有化
    private SingletonDemo2() {
    }

    //方法同步,调用效率低!
    public static synchronized SingletonDemo2 getInstance() {
        if (s == null) {
            s = new SingletonDemo2();
        }
        return s;
    }
}
