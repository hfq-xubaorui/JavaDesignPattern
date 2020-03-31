package com.xubaorui.compoundpattern.factory;

import com.xubaorui.compoundpattern.Goose;
import com.xubaorui.compoundpattern.adapter.GooseAdapter;

/**
 * @author xbr
 * @Date 2020-03-13
 * @ClassName GooseFactory
 * @Description
 */
public class GooseFactory extends GooseFactoryInterface {
    @Override
    public Goose createGoose() {
        return new Goose();
    }

    @Override
    public GooseAdapter createGooseAdapter() {
        return new GooseAdapter(createGoose());
    }
}
