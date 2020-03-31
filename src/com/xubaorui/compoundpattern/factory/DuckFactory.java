package com.xubaorui.compoundpattern.factory;

import com.xubaorui.compoundpattern.*;

/**
 * @author xbr
 * @Date 2020-03-13
 * @ClassName DuckFactory
 * @Description
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
