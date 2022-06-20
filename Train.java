package com.company;

public class Train extends Vehicle implements IGoStop{

    @Override
    public void go() {
        this.startEngine();
        System.out.println("Train going");
    }

    @Override
    public void stop() {
        this.stopEngine();
        System.out.println("Train stopping");
    }
}
