package com.xubaorui.compoundpattern.adapter;

import com.xubaorui.compoundpattern.Goose;
import com.xubaorui.compoundpattern.Quackable;

/**
 * @author xbr
 * @Date 2020-03-13
 * @ClassName GooseAdapter
 * @Description
 */
public class GooseAdapter implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void qucak() {
        goose.honk();
    }
}
