package com.xubaorui.compoundpattern.factory;

import com.xubaorui.compoundpattern.Quackable;

/**
 * @author xbr
 * @Date 2020-03-13
 * @ClassName AbstractDuckFactory
 * @Description
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
