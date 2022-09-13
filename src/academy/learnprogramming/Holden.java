package academy.learnprogramming;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden engine is starting.";
    }

    @Override
    public String accelerate() {
        return "Holden car is accelerating.";
    }

    @Override
    public String brake() {
        return "Holden car is breaking";
    }
}
