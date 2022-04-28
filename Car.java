package com.company;

public class Car {
    private int tank;
    private int tankCapacity;
    private int fuelConsumption; // fuel consumption per 100 miles
    private int distance;

    public Car(int tankCapacity,int fuelConsumption){
        this.tank = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }
    public void drive (int miles){
        distance += miles;
        tank -= miles*fuelConsumption;
    }

    public int getDistance() {
        return distance;
    }
    public void resetDistance(){
        distance = 0;
    }

    public void fillTank(int gas){
        int gasSumm = gas + tank;
        if(gasSumm<tankCapacity){
            tank += gas;
        }
        else{
            tank = tankCapacity;
            String notFilledGas = Integer.toString(gasSumm-tankCapacity);
            String filledGas = Integer.toString(tankCapacity - tank);
            System.out.println("Tank is refueled on " + filledGas +"liters, " + notFilledGas + "liters did not fit into the tank.");
        }
    }
}
