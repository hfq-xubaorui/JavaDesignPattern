package com.xubaorui.compoundpattern.observable;

import java.util.ArrayList;
import java.util.Observer;

/**
 * @author xbr
 * @Date 2020-03-13
 * @ClassName Observable
 * @Description
 */
public class Observable implements QuackObservable {
    ArrayList<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    /*@Override
    public void registerObserver(Observer observer) {


    }

    @Override
    public void notifyObservers() {

    }*/
}
