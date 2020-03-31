package com.xubaorui.compoundpattern.zuhe;

import com.xubaorui.compoundpattern.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author xbr
 * @Date 2020-03-13
 * @ClassName Flock
 * @Description
 */
public class Flock implements Quackable {
    ArrayList<Quackable> quackables = new ArrayList();

    public void add(Quackable quacker) {
        quackables.add(quacker);
    }

    @Override
    public void qucak() {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.qucak();
        }
    }
}
