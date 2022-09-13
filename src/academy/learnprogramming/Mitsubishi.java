package academy.learnprogramming;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi engine is starting.";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi car is accelerating.";
    }

    @Override
    public String brake() {
        return "Mitsubishi car is breaking";
    }

}
