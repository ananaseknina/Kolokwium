package com.company;

public class Plane extends Vehicle implements IFly{

    double maxSpeed;

    public Plane() {
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void fly(double maxSpeed) {
        try{
            if(this.isEngineRunning()){
                throw new EngineAlreadyRunningException("Engine is already running");
            }
        }catch( EngineAlreadyRunningException e){
            System.out.println(e.getMessage());
        }this.startEngine();
       this.maxSpeed = maxSpeed;

    }

    @Override
    public void isFlying() {
        if(this.isEngineRunning()){
            System.out.println("Plane is flying");
        }
        if(!this.isEngineRunning()){
            System.out.println("Plane is not flying");
        }

    }
}
