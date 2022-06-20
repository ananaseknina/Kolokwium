package com.company;

public class Drone extends Vehicle implements IGoStopFly{
    private double x;
    private double y;

    public Drone(double x, double y) {
        try {
            if(!(x>0 && y>0)){

                throw new InvalidCoordinatesException("X and y cannot be negative");

            }
        }catch(InvalidCoordinatesException e){
            System.out.println(e.getMessage());
        }
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void fly() {
        try{
            if(this.isEngineRunning()) {
                throw new EngineAlreadyRunningException("Engine is already running");
            }
        }
        catch (EngineAlreadyRunningException e){
            System.out.println(e.getMessage());
        }
        this.startEngine();
        System.out.println("Dron Leci");
    }

    @Override
    public void go(){
        try{
            if(this.isEngineRunning()) {
                throw new EngineAlreadyRunningException("Engine is already running");
            }
        }
        catch (EngineAlreadyRunningException e){
            System.out.println(e.getMessage());
        }

        this.startEngine();
        System.out.println("Dron Jedzie");
    };

    @Override
    public void stop(){
        this.setEngineRunning(false);
        System.out.println("Dron Zatrzymuje się");
    };

}
