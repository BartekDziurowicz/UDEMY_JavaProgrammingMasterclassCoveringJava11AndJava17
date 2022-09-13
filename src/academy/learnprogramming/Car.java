package academy.learnprogramming;

public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        engine=true;
        wheels=4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Engine is starting";
    }

    public String accelerate(){
        return "Car is accelerating";
    }

    public String brake(){
        return "Car is breaking";
    }
}
