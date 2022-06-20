package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Train t = new Train();
        t.go();
        System.out.println(t.isEngineRunning());
        t.stop();
        System.out.println(t.isEngineRunning());

        Drone d = new Drone(2,3);
        d.go();
        d.go();
        System.out.println(d.isEngineRunning());
        d.stop();
        System.out.println(d.isEngineRunning());
    }
}
