package com.xubaorui.compoundpattern.factory;

import com.xubaorui.compoundpattern.Goose;
import com.xubaorui.compoundpattern.adapter.GooseAdapter;

public abstract class GooseFactoryInterface {
    public abstract Goose createGoose();

    public abstract GooseAdapter createGooseAdapter();
}
