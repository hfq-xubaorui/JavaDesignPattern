package com.xubaorui.compoundpattern;

import com.xubaorui.compoundpattern.adapter.GooseAdapter;
import com.xubaorui.compoundpattern.factory.AbstractDuckFactory;
import com.xubaorui.compoundpattern.factory.CountingDuckFactory;
import com.xubaorui.compoundpattern.factory.GooseFactory;
import com.xubaorui.compoundpattern.zuhe.Flock;

/**
 * @author xbr
 * @Date 2020-03-13
 * @ClassName DuckSimulator
 * @Description
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory abstractDuckFactory = new CountingDuckFactory();
        GooseFactory gooseFactory = new GooseFactory();
        duckSimulator.simulate(abstractDuckFactory);
//        duckSimulator.simulate(abstractDuckFactory, gooseFactory);
    }

    void simulate(AbstractDuckFactory duckFactory, GooseFactory gooseFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapter = gooseFactory.createGooseAdapter();

        System.out.println("\nDuck Simualtor: With Abstract Factory And Goose");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times ");

    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseAdapter);

        Flock flockOfMallards = new Flock();

        Quackable mallardDuckone = duckFactory.createMallardDuck();
        Quackable mallardDucktwo = duckFactory.createMallardDuck();
        Quackable mallardDuckthree = duckFactory.createMallardDuck();
        Quackable mallardDuckfour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardDuckone);
        flockOfMallards.add(mallardDucktwo);
        flockOfMallards.add(mallardDuckthree);
        flockOfMallards.add(mallardDuckfour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simualtor: Whole Flock Simulation");
        flockOfDucks.qucak();

        System.out.println("\nDuck Simualtor: Mallard Flock Simulation");
        flockOfMallards.qucak();

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times ");


    }

    void simulate() {
        /*
        Quackable mallardDuck =new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("\nDuck Simualtor");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        * */

        //----------------------------------------------------------------------
        /*
        Quackable mallardDuck =new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simualtor");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        * */

        //----------------------------------------------------------------------
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simualtor");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times ");


    }

    void simulate(Quackable quackable) {
        quackable.qucak();
    }
}
