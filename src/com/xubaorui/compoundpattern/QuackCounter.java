package com.xubaorui.compoundpattern;

/**
 * @author xbr
 * @Date 2020-03-13
 * @ClassName QuackCounter
 * @Description
 */
public class QuackCounter implements Quackable {
    Quackable quackable;
    static int numberOfQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void qucak() {
        quackable.qucak();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}

