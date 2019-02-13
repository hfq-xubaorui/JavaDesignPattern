package com.xubaorui.singleton;

/**
 * @author xbr
 * @Description 饿汉式
 * @ClassName SingletonDemo1
 * @Date 2019/2/13
 * @Version 1.0
 * @since JDK 1.8
 */
public class SingletonDemo1 {

    //类初始化时,立即加载这个对象(没有延时加载的优势). 由于加载类时,天然的是线程安全的.
    private static SingletonDemo1 instance = new SingletonDemo1();

    //构造器私有化
    private SingletonDemo1() {
    }

    //方法没有同步,调用效率高!
    public SingletonDemo1 getInstance() {
        return instance;
    }


}
