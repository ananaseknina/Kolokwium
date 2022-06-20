package com.company;

import java.util.ArrayList;

public class Hangar {

    private int capacity;
    private ArrayList<Vehicle> vehicles;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addVehicle(Vehicle vehicle){
        try{
            if(vehicles.size()+1 > capacity){
                throw new ExceededCapacityException("Capacity of hangar exceeded");
            }
            else{
                vehicles.add(vehicle);
            }
        }
        catch(ExceededCapacityException e){
            System.out.println(e.getMessage());
        }
    }
    public Hangar(int capacity) {
        this.capacity = capacity;
    }


}
