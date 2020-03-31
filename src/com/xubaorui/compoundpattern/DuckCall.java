package com.xubaorui.compoundpattern;

/**
 * @author xbr
 * @Date 2020-03-13
 * @ClassName DuckCall
 * @Description
 */
public class DuckCall implements Quackable {

    @Override
    public void qucak() {
        System.out.println("Kwak");
    }
}
