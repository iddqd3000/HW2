package com.company;


interface Measuarble {
    double getMeasuare();
}


public class Employee implements Measuarble {
    public String name;
    public int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public double getMeasuare(){
        return salary;
    }
    public static double average(Measuarble[] objects)
    {
        double sum = 0;
        for (Measuarble i : objects){
            sum += i.getMeasuare();
        }
        if (objects.length > 0)
            return sum / objects.length;
        else
        return 0;
    }
    public static Measuarble largest(Measuarble[] objects) {
        Measuarble largestM = null;
        for (Measuarble i : objects) {
            if (largestM == null || i.getMeasuare() > largestM.getMeasuare()) {
                largestM = i;
            }
        }
        return largestM;
    }
}
