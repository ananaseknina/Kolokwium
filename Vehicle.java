package com.company;

public abstract class Vehicle implements IEngineRunStop, ILoad {
    private int places;
    private double capacity;
    private boolean isEngineRunning;

    public int getPlaces() {
        return places;
    }

    public double getCapacity() {
        return capacity;
    }

    public boolean isEngineRunning() {
        return isEngineRunning;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setEngineRunning(boolean engineRunning) {
        isEngineRunning = engineRunning;
    }

    public void startEngine(){
        try{
            if(isEngineRunning) {
                throw new EngineAlreadyRunningException("Engine is already running");
            }
            isEngineRunning = true;
        }
        catch (EngineAlreadyRunningException e){
            System.out.println(e.getMessage());
        }
    }

    public void stopEngine(){
        isEngineRunning = false;
    }

    public void load(double loadCapacity){

        if(loadCapacity>capacity){
            System.out.println("Cannot load");
        }
        else{
            capacity -= loadCapacity;
            System.out.println("Loaded capacity: " + loadCapacity+" capacity left: "+capacity);
        }

    }


}
